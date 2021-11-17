/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB30/StatelessEjbClass.java to edit this template
 */
package ma.lahrach.lahrachcustomerapp.session;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ma.lahrach.lahrachcustomerapp.entities.Customer;

/**
 *
 * @author lial
 */
@Stateless
public class CustomerManager {
    public List<Customer> getAllCustomers(){
        return null;
    }
    
    public Customer update(){
        return null;
    }
    
    @PersistenceContext(unitName ="customerPersistanceUnit")
    private EntityManager em;
    
    public void persist(Object object) {
  em.persist(object);
}
}
