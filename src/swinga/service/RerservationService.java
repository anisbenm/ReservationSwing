/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinga.service;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import swinga.entity.Reservation;

/**
 *
 * @author Administrateur
 */
public class RerservationService {
    
    public void ajouterReservation (Reservation reservation){
        
        EntityManager em= Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(reservation);
        em.getTransaction().commit();
        
    }
    
}
