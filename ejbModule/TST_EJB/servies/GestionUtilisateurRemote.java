package TST_EJB.servies;

import java.util.List;

import javax.ejb.Remote;

import Ejb_packge.Abonne;
import Ejb_packge.Abonnement;
import Ejb_packge.Admin;
import Ejb_packge.Utilisateur;

@Remote
public interface GestionUtilisateurRemote {
	 public Utilisateur authentification(String login, String password);
	 public void addAbonne (Utilisateur abonne);
	 public void modifyAbonne (Abonne abonne);
	 public void deleteAbonne (Abonne abonne);
	 public Abonne findAbonneByCin(Integer cin);
	 public Abonnement findAbonnementById(Integer id);
	 public List<Abonnement> findAllAbonnement(Integer cin);	 
}
