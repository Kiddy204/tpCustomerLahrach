/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ma.lahrach.lahrachcustomerapp.session;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import ma.lahrach.lahrachcustomerapp.entities.DiscountCode;
import ma.lahrach.lahrachcustomerapp.entities.MicroMarket;

/**
 *
 * @author lial
 */
@Stateless
public class ZipCodeManager {

    @PersistenceContext(unitName = "customerPersistanceUnit")
    private EntityManager em;
     
    public List<MicroMarket> getAllZipCodes() {
        Query query = em.createNamedQuery("MicroMarket.findZipCodes");
        return query.getResultList();
    }


    public void persist(MicroMarket microMarket) {
       em.persist(microMarket);
    }

    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    
}
