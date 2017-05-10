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
import swinga.entity.Chambre;

/**
 *
 * @author Administrateur
 */
public class ChambreService {
    
    public void ajoutChambre(Chambre ch){
        EntityManager em = Persistence.createEntityManagerFactory("pu").createEntityManager();
        em.getTransaction().begin();
        em.persist(ch);
        em.getTransaction().commit();
    }
    
    public List<Chambre> listerChambres(){
        EntityManager em= Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT c FROM Chambre c ORDERBY c.nom").getResultList();
    }
    
}
