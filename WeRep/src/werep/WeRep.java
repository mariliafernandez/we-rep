/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package werep;

import Controller.RepublicaJpaController;
import Model.Republica;
import javax.persistence.Entity;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Álvaro
 */
public class WeRep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("WeRepPU2");
        
        Republica rep = new Republica(1,"Cuecas de Fogo","Francisco Reghin",242,"Seugling","Cornelio Procopio","PR");
     
        RepublicaJpaController republicaJpaController = new RepublicaJpaController();
        
        republicaJpaController.create(rep);
 
        System.out.println("Republica cadastrada!");
        
    }
    
}
