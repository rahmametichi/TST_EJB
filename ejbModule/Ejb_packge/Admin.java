package Ejb_packge;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="admin")
@Entity
public class Admin extends Utilisateur{
	private int code;
	
	
	@OneToMany(fetch = FetchType.EAGER ,cascade = {CascadeType.PERSIST, CascadeType.REMOVE} ,mappedBy="admin")
	private List<Abonne> abonne; 
	
	
	public Admin(int code) {
		super();
		this.code=code;
	}

	public Admin() {
		super();
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	    
}