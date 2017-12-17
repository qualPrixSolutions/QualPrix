package com.qual.prix.solutions.webstock.domaine;

import java.io.Serializable;
import java.util.Date;

public class InformationsUtilisateur implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5299499798088995185L;
	
	
	
	private String firstname;
	private String lastName;
	private String email;
	private String login;
	private String password;
	private Date birthday;
	private int phoneNumber;
	private String country;
	private String city;
	private String codePostal;
	private String street;
	private int streetNumber;
	
	
	
	public InformationsUtilisateur() {
		super();
	}



	public InformationsUtilisateur(String firstname, String lastName, String email, String login, String password,
			Date birthday, int phoneNumber, String country, String city, String codePostal, String street,
			int streetNumber) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.login = login;
		this.password = password;
		this.birthday = birthday;
		this.phoneNumber = phoneNumber;
		this.country = country;
		this.city = city;
		this.codePostal = codePostal;
		this.street = street;
		this.streetNumber = streetNumber;
	}



	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((codePostal == null) ? 0 : codePostal.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + phoneNumber;
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + streetNumber;
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
		InformationsUtilisateur other = (InformationsUtilisateur) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (codePostal == null) {
			if (other.codePostal != null)
				return false;
		} else if (!codePostal.equals(other.codePostal))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (streetNumber != other.streetNumber)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "InformationsUtilisateur [firstname=" + firstname + ", lastName=" + lastName + ", email=" + email
				+ ", login=" + login + ", password=" + password + ", birthday=" + birthday + ", phoneNumber="
				+ phoneNumber + ", country=" + country + ", city=" + city + ", codePostal=" + codePostal + ", street="
				+ street + ", streetNumber=" + streetNumber + "]";
	}
	

}
