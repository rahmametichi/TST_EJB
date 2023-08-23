package Ejb_packge;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="utilisateur")
@Entity
public class Utilisateur implements Serializable{
	@Id
	private int cin;
	private String nom;
	private String prenom;
	private String mail;
	private Integer tel;
	private String login;
	private String password;
	
	public Utilisateur (int cin, String nom, String prenom, String mail, Integer tel, String login, String password) {
		super();
		this.cin=cin;
		this.nom=nom;
		this.prenom=prenom;
		this.mail=mail;
		this.tel=tel;
		this.login=login;
		this.password=password;
	}

	public Utilisateur() {
	}

	public int getCin() {
		return cin;
	}

	public void setCin(int cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Integer getTel() {
		return tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
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
	
}
