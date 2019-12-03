
  package com.cout.incognito.models;
  
  import java.io.Serializable;
  
  import javax.persistence.Column; import javax.persistence.Embeddable;
  
  @Embeddable 
  public class QuestionKey implements Serializable{
  
	  @Column(name= "user_id") 
	  Long userId;
		  
	  @Column(name= "course_id") 
	  Long courseId;

	public QuestionKey(Long userId, Long courseId) {
		super();
		this.userId = userId;
		this.courseId = courseId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((courseId == null) ? 0 : courseId.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QuestionKey other = (QuestionKey) obj;
		if (courseId == null) {
			if (other.courseId != null)
				return false;
		} else if (!courseId.equals(other.courseId))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	  
}
		 