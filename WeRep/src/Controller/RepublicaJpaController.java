/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.exceptions.NonexistentEntityException;
import Model.Morador;
import Model.Republica;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Álvaro
 */
public class RepublicaJpaController implements Serializable {

    public RepublicaJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public RepublicaJpaController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Republica republica) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(republica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Republica republica) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            republica = em.merge(republica);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = republica.getId();
                if (findRepublica(id) == null) {
                    throw new NonexistentEntityException("The republica with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Republica republica;
            try {
                republica = em.getReference(Republica.class, id);
                republica.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The republica with id " + id + " no longer exists.", enfe);
            }
            em.remove(republica);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Republica> findRepublicaEntities() {
        return findRepublicaEntities(true, -1, -1);
    }

    public List<Republica> findRepublicaEntities(int maxResults, int firstResult) {
        return findRepublicaEntities(false, maxResults, firstResult);
    }

    private List<Republica> findRepublicaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Republica.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Republica findRepublica(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Republica.class, id);
        } finally {
            em.close();
        }
    }

    public int getRepublicaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Republica> rt = cq.from(Republica.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

public Republica encontraRep(String rep) {
        EntityManager em = getEntityManager();
        
        String sql = "Select * FROM Republica where nome = '" + rep + "';";
        Query q = em.createNativeQuery(sql);
        List<Object[]> result = q.getResultList();
        Republica republica = new Republica();
        for (Object[] a : result) {
         republica.setId((int) a[0]);
         republica.setNome((String) a[1]);
         republica.setEndereco((String) a[2]);
         republica.setNumero((int) a[3]);
         republica.setBairro((String) a[4]);
         republica.setCidade((String) a[5]);
         republica.setEstado((String) a[6]);
       }
        return republica;

    }
    
}
