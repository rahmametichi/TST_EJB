package TST_EJB.servies;

import javax.ejb.Local;
import Ejb_packge.Admin;

@Local
public interface GestionAdminLocal {
	 public Admin authentification(String login, String password);
}
