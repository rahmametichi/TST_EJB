package TST_EJB.servies;

import javax.ejb.Remote;
import Ejb_packge.Admin;

@Remote
public interface GestionAdminRemote {
	 public Admin authentification(String login, String password);
}
