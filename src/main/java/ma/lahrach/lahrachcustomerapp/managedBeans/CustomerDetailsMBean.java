/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.lahrach.lahrachcustomerapp.managedBeans;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import ma.lahrach.lahrachcustomerapp.entities.Customer;
import ma.lahrach.lahrachcustomerapp.entities.DiscountCode;
import ma.lahrach.lahrachcustomerapp.entities.MicroMarket;
import ma.lahrach.lahrachcustomerapp.session.CustomerManager;
import ma.lahrach.lahrachcustomerapp.session.DiscountCodeManager;
import ma.lahrach.lahrachcustomerapp.session.ZipCodeManager;

/**
 *
 * @author lial
 */
@Named(value = "customerDetailsMBean")
@ViewScoped
public class CustomerDetailsMBean implements Serializable{


    
    private int idCustomer;
    private Customer customer;

    @EJB
    private CustomerManager customerManager;

    @EJB
    private DiscountCodeManager discountCodeManager;

    @EJB
    private ZipCodeManager zipCodeManager;

    public int getIdCustomer() {
      return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
      this.idCustomer = idCustomer;
    }

    public Customer getDetails() {
      return customer;
    }
    
    public List<DiscountCode> getDiscountCodes() {
        return discountCodeManager.getAllDiscountCodes();
    }
    public List<MicroMarket> getZipCodes(){
        return zipCodeManager.getAllZipCodes();
                
                
               
    }
    public String update() {
      customer = customerManager.update(customer);
      return "CustomerList";
    }

    public void loadCustomer() {
      this.customer = customerManager.getCustomer(idCustomer);
    }

}
