package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String name;
	private String email;
	private Date birthDate;

	public Client() {
	}

	public Client(String name, String email, String birthDate) throws ParseException {
		this.name = name;
		this.email = email;
		this.birthDate = sdf.parse(birthDate);
	}

	public String toString() {
		return name + " (" + sdf.format(birthDate) + ") - " + email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthDate() {
		return sdf.format(birthDate);
	}

	public void setBirthDate(String birthDate) throws ParseException {
		this.birthDate = sdf.parse(birthDate);
	}

}
