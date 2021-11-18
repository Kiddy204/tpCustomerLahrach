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
import ma.lahrach.lahrachcustomerapp.entities.Customer;

/**
 *
 * @author lial
 */
@Stateless
public class CustomerManager {
    
    @PersistenceContext(unitName ="customerPersistanceUnit")
    private EntityManager em;
    
    public List<Customer> getAllCustomers(){
        Query query = em.createNamedQuery("Customer.findAll");
        return query.getResultList();
               
    }
    
    public Customer update(Customer customer){
        return em.merge(customer);
    }
    
    
    public Customer getCustomer(int idCustomer) {  
      return em.find(Customer.class, idCustomer);  
    }

    public void persist(Customer customer) {
        em.persist(customer);
    }

}
