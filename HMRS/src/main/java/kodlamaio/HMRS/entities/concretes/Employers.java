package kodlamaio.HMRS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data 
@Entity
@Table(name="employers")
public class Employers extends Users{
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="company_name")
	private String company_name;
	
	@Column(name="web_address")
	private String web_address;
	
	@Column(name="phone_number")
	private int phone_number;
	
	public Employers(int id, String company_name, String web_address, int phone_number) {
		super();
		this.id = id;
		this.company_name = company_name;
		this.web_address = web_address;
		this.phone_number = phone_number;
	}
}
