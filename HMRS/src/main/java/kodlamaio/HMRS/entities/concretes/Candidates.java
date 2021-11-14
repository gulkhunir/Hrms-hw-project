package kodlamaio.HMRS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Entity
@Data
@Table(name="candidates")
public class Candidates extends Users{
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="identity_Number")
	private String identity_Number;
	
	@Column(name="birth_of_year")
	private int birth_of_year;
	
	public Candidates(int id, String first_name, String last_name, String identity_Number, int birth_of_year) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.identity_Number = identity_Number;
		this.birth_of_year = birth_of_year;
	}
}
