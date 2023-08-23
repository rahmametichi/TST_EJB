package TST_EJB.servies;

import java.util.List;

import javax.ejb.Remote;
import Ejb_packge.Abonne;
import Ejb_packge.Abonnement;
import Ejb_packge.Admin;

@Remote
public interface GestionAbonneRemote {
	 public void addAbonne (Abonne abonne);
	 public void findAbonneByCin(Integer cin);
	 public void modifyAbonne (Abonne abonne);
	 public void deleteAbonne (Abonne abonne);
	 public Abonnement findAbonnementById(Integer id);
	 public List<Abonnement> findAllAbonnement(Integer cin);
	 public Abonne authentification(String login, String password);
}
