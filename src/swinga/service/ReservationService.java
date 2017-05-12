/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinga.service;

import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import swinga.entity.Chambre;
import swinga.entity.Reservation;

/**
 *
 * @author Administrateur
 */
public class ReservationService {

    public void ajouterReservation(Reservation reservation, long idChambre) {

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        
        // Association resa / chambre bi-directionnelle
        Chambre chambreSel= em.find(Chambre.class, idChambre);
       
        
        
        em.persist(reservation);
         reservation.getChambres().add(chambreSel);
        chambreSel.getReservations().add(reservation);
        em.getTransaction().commit();

    }

    public List<Reservation> ListerReservation() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT r FROM Reservation r").getResultList();
    }

    public void supprimer(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("DELETE FROM Reservation r WHERE r.id=" + id);
        query.executeUpdate();
        em.getTransaction().commit();
    }
    
    
    public void moddifierReservation(long id, Date Date_ArriveeModif, Date DateSortieModif){
        EntityManager em= Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.merge("UPDATE FROM Reservation r SET DateArrivee=:"+Date_ArriveeModif+"DateSortie=:"+DateSortieModif+  "   WHERE r.id=" + id);
        em.getTransaction().commit();
        
       
        
    }
}
