package com.cout.incognito;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;



@Configuration
@EnableWebSecurity
public class SecurityConfiguration  extends WebSecurityConfigurerAdapter{
	
	
	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private DataSource dataSource;
	
	@Value("${spring.queries.users-query}")
	private String studentQuery;
	
	@Value("${spring.queries.user-role-query}")
	private String studentRoleQuery;
	
	//@Value("${spring.queries.teachers-query}")
	//private String teacherQuery;
	
	//@Value("${spring.queries.teacher-role-query}")
	//private String teacherRoleQuery;
	
	@Autowired
	private CustomLoginSuccessHandler successHandler;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.jdbcAuthentication().usersByUsernameQuery(studentQuery).authoritiesByUsernameQuery(studentRoleQuery)
			.dataSource(dataSource).passwordEncoder(bCryptPasswordEncoder);
	      //auth.inMemoryAuthentication()
	      //.withUser("admin").password(passwordEncoder().encode("admin123")).roles("teacher");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
			.authorizeRequests()
				.antMatchers("/").permitAll()
				.antMatchers("/login").permitAll()
				.antMatchers("/studentSU").permitAll()
				.antMatchers("/teacherSU").permitAll()
				.antMatchers("/registered-User").permitAll()
				.antMatchers("/registered-Teacher").permitAll()
				.antMatchers("/confirm-user-account").permitAll()
				.antMatchers("/confirm-teacher-account").permitAll()
				.antMatchers("/error").permitAll()
				.antMatchers("/editQuestionNudge").hasAuthority("student")
				.antMatchers("/editQuestionDelete").hasAuthority("student")
				.antMatchers("/teacherQuestionDelete").hasAuthority("teacher")
				.antMatchers("/editQuestion?**").hasAuthority("teacher")
				.antMatchers("/joinCourse").hasAuthority("student")
				.antMatchers("/studentDash").hasAuthority("student")
				.antMatchers("/studentMessageBoard").hasAnyAuthority("student")
				.antMatchers("/answeredQuestion").hasAuthority("teacher")
				.antMatchers("/addClass").hasAuthority("teacher")
				.antMatchers("/teacherDash").hasAuthority("teacher")
				.antMatchers("/teacherMessageBoard").hasAuthority("teacher")
				.anyRequest()
				.authenticated()
				.and()
				.csrf().disable()
			.formLogin()
				.loginPage("/login")
				.failureUrl("/login?error=true")
				.successHandler(successHandler)
				.usernameParameter("email")
				.passwordParameter("password")
				.and()
			.logout()
				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
				.logoutSuccessUrl("/").and()
				.exceptionHandling()
			.accessDeniedPage("/access-denied");
	}
	
	@Override
	public void configure(WebSecurity web) {
		web.ignoring().antMatchers("/resources/**", "/static/**", "/css/**", "/js/**", "/img/**","/scss/**","/vendor/**");
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
}
