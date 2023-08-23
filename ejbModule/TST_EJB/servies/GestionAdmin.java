package TST_EJB.servies;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import Ejb_packge.Admin;


@Stateless
public class GestionAdmin implements GestionAdminRemote, GestionAdminLocal {

	@PersistenceContext(unitName="TST_EJB")
      private EntityManager entityManager;
    
	@Override
	public Admin authentification(String login, String password) {
		Query query;
		try {
		String req1="SELECT e FORM Admin e WHERE e.login = :p1 AND e.password = :p2";
		query = entityManager.createQuery(req1);
		query.setParameter("p1",login);
		query.setParameter("p2",password);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return (Admin) query.getSingleResult();
    } 
}