package TST_EJB.servies;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import Ejb_packge.Abonne;
import Ejb_packge.Abonnement;


@Stateless
public class GestionAbonne implements GestionAbonneRemote {

	@PersistenceContext(unitName="TST_EJB")
    private EntityManager entityManager;
	
	 @Override
	  public void addAbonne (Abonne abonne) {
		  entityManager.persist(abonne);
	  }
	  
	  
	  @Override
	  public void modifyAbonne (Abonne abonne) {
		  entityManager.merge(abonne);
	  }
	  
	  @Override
	  public void findAbonneByCin (Integer cin) {
		  entityManager.remove(cin);
	  }
	  
	  @Override
	  public void deleteAbonne (Abonne abonne) {
		  entityManager.remove(abonne);
	  }


	@Override
	public Abonnement findAbonnementById(Integer id) {
		return entityManager.find(Abonnement.class, id);
	}
    

	@Override
	public List<Abonnement> findAllAbonnement(Integer cin) {
		Query query;
		try {
		String req2="SELECT X FROM Abonnement a1, Abonne a2 WHERE a1.id=a2.id AND a2.cin= : px";
		query = entityManager.createQuery(req2);
		query.setParameter("px",cin);
	    }catch(Exception e){
		e.printStackTrace();
		return null;
	}
		return (List<Abonnement>) query.getResultList();
	}


	@Override
	public Abonne authentification(String login, String password) {
		Query query;
		try {
		String req1="SELECT e FORM Abonne e WHERE e.login = :p1 AND e.password = :p2";
		query = entityManager.createQuery(req1);
		query.setParameter("p1",login);
		query.setParameter("p2",password);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return (Abonne) query.getSingleResult();
	}
	
	

}
