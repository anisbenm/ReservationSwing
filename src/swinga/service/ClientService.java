/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinga.service;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import swinga.entity.Client;

/**
 *
 * @author Administrateur
 */
public class ClientService {
    
    public void ajoutClient(Client cl){
        EntityManager em = Persistence.createEntityManagerFactory("pu").createEntityManager();
        em.getTransaction().begin();
        em.persist(cl);
        em.getTransaction().commit();  
    }
    
}
