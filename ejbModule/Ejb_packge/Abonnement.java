package Ejb_packge;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Abonnement")
public class Abonnement implements Serializable{
    @Id
	private Integer id;
	private Date date_d;
	private Date date_f;
	private Integer id_t;
	private Integer id_v;
	private double solde;
	
	
	@ManyToOne
	private Abonne abonne;
	
	
	public Abonnement(Integer id, Date date_d, Date date_f, Integer id_t, Integer id_v, Abonne abonne, double solde) {
		super();
		this.id = id;
		this.date_d = date_d;
		this.date_f = date_f;
		this.id_t = id_t;
		this.id_v = id_v;
		this.abonne = abonne;
		this.solde=solde;
	}
	
	public Abonnement() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate_d() {
		return date_d;
	}

	public void setDate_d(Date date_d) {
		this.date_d = date_d;
	}

	public Date getDate_f() {
		return date_f;
	}

	public void setDate_f(Date date_f) {
		this.date_f = date_f;
	}

	public Integer getId_t() {
		return id_t;
	}

	public void setId_t(Integer id_t) {
		this.id_t = id_t;
	}

	public Integer getId_v() {
		return id_v;
	}

	public void setId_v(Integer id_v) {
		this.id_v = id_v;
	}

	public Abonne getAbonne() {
		return abonne;
	}

	public void setAbonne(Abonne abonne) {
		this.abonne = abonne;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	
}
