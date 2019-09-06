package entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"dateCreated", "dateModified"}, 
        allowGetters = true)
@Table(name = "employee_details")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "employee_id")
	private long id;
	
	@Column(name = "date_created")
	@NotBlank
	@CreatedDate
	private Date dateCreated;
	
	@Column(name = "date_modified")
	@LastModifiedDate
	@NotBlank
	private Date dateModified;
	
	@NotBlank
	@Column(name = "first_name")
	private String firstName;
	
	@NotBlank
	@Column(name = "last_name")
	private String lastName;
	
	@NotBlank
	@Column(name = "date_of_birth")
	private String dob;
	
	@NotBlank
	@Column(name = "gender")
	private String gender;
	
	@NotBlank
	@Column(name = "mobile_number")
	private String mobileNumber;
	
	@NotBlank
	@Column(name = "email_address")
	private String emailId;
	
	@NotBlank
	@Column(name = "designation")
	private String designation;

}
