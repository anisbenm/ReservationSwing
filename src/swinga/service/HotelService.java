/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinga.service;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import swinga.entity.Hotel;

/**
 *
 * @author Administrateur
 */
public class HotelService {
    public void ajouter(Hotel hotel){
        EntityManager em= Persistence.createEntityManagerFactory("pu").createEntityManager();
        em.getTransaction().begin();
        em.persist(hotel);
        em.getTransaction().commit();
    }
    
    public List<Hotel> lister(){
    EntityManager em = Persistence.createEntityManagerFactory("pu").createEntityManager();
    return em.createQuery("SELECT h FROM Hotel h ORDER BY h.nom").getResultList();
    }
}
