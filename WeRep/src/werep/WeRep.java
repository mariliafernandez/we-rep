/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package werep;

import Controller.MoradorJpaController;
import Controller.RepublicaJpaController;
import Model.Morador;
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
        
      /*  Republica rep = new Republica(3,"Area 14","Francisco Reghin",242,"Seugling","Cornelio Procopio","PR");
     
        RepublicaJpaController republicaJpaController = new RepublicaJpaController(entityManagerFactory);
        
        republicaJpaController.create(rep);
 
        System.out.println("Republica cadastrada!");
        
        Morador mor = new Morador(1,10.00,"Alvaro","Pedroso Queiroz","alvaropq1@hotmail.com","alvaropq","bmprlb85",rep);
       
       MoradorJpaController moradorJpaController = new MoradorJpaController(entityManagerFactory);
       
       moradorJpaController.create(mor);
       
       System.out.println("Morador cadastrado!");*/
      
      /*
      Republica rep = new Republica();
        
      RepublicaJpaController republicaJpaController = new RepublicaJpaController(entityManagerFactory);
      
      rep = republicaJpaController.findRepublica(1);
      
      System.out.println(rep.getNome());
      
      Morador mor = new Morador();
      
      MoradorJpaController moradorJpaController = new MoradorJpaController(entityManagerFactory);
      
      mor = moradorJpaController.findMorador(1);
      
      System.out.println(mor.getNome()+" "+mor.getSobreNome());
      
      mor.setSobreNome("Queiroz");
      
      try{
        moradorJpaController.edit(mor);
      }
      catch(Exception e){
          System.out.println("Erro");
      }
      
      System.out.println(mor.getNome()+" "+mor.getSobreNome());
    */
    }
    
}
