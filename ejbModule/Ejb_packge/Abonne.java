package Ejb_packge;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="abonne")
@Entity
public class Abonne extends Utilisateur{
	private String adress;
	private Integer photo;
	
	
	@OneToMany(fetch = FetchType.EAGER ,cascade = {CascadeType.PERSIST, CascadeType.MERGE , CascadeType.REMOVE} ,mappedBy="abonne")
	private List<Abonnement> abonnement;  
	
	@ManyToOne
	private Admin admin;
	
	public Abonne(String adress, Integer photo) {
		super();
		this.adress=adress;
		this.photo=photo;
	}

	public Abonne() {
		super();
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Integer getPhoto() {
		return photo;
	}

	public void setPhoto(Integer photo) {
		this.photo = photo;
	}
			
}
