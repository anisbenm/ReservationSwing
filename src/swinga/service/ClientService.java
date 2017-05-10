/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinga.service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import swinga.entity.Client;

/**
 *
 * @author Administrateur
 */
public class ClientService {

    public void ajoutClient(Client cl) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(cl);
        em.getTransaction().commit();
    }

    public List<Client> lister() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        return em.createQuery("SELECT c FROM Client c ORDER BY c.nom").getResultList();
    }

    public void supprimer(long id) {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        Query query = em.createQuery("DELETE FROM Client cl WHERE cl.id=" + id);
        query.executeUpdate();
        em.getTransaction().commit();
    }
}
