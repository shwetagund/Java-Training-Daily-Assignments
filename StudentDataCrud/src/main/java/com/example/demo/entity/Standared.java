package com.example.demo.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Standared implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long standaredId;
	
	@Column
	private String standName;
	private String standDecp;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Student student;

	@OneToMany(cascade=CascadeType.ALL)
	private Teachers teacher;

	public Long getStandaredId() {
		return standaredId;
	}

	public void setStandaredId(Long standaredId) {
		this.standaredId = standaredId;
	}

	public String getStandName() {
		return standName;
	}

	public void setStandName(String standName) {
		this.standName = standName;
	}

	public String getStandDecp() {
		return standDecp;
	}

	public void setStandDecp(String standDecp) {
		this.standDecp = standDecp;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teachers getTeacher() {
		return teacher;
	}

	public void setTeacher(Teachers teacher) {
		this.teacher = teacher;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(standDecp, standName, standaredId, student, teacher);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Standared other = (Standared) obj;
		return Objects.equals(standDecp, other.standDecp) && Objects.equals(standName, other.standName)
				&& Objects.equals(standaredId, other.standaredId) && Objects.equals(student, other.student)
				&& Objects.equals(teacher, other.teacher);
	}

	@Override
	public String toString() {
		return "Standared [standaredId=" + standaredId + ", standName=" + standName + ", standDecp=" + standDecp
				+ ", student=" + student + ", teacher=" + teacher + "]";
	}
	
	
	
}
