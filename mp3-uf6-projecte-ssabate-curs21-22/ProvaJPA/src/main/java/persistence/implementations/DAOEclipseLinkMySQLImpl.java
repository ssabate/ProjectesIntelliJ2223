package persistence.implementations;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import persistence.daos.DAO;
import persistence.entities.Pojo;
import persistence.exceptions.DAOException;
import persistence.javabeans.JavaBeansJPA;

import java.util.List;

public class DAOEclipseLinkMySQLImpl implements DAO<Pojo> {
    private JavaBeansJPA bean;
    private EntityManagerFactory emf;

    public DAOEclipseLinkMySQLImpl(String persistenceUnitName) throws DAOException {
        try {
            this.emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        } catch (Exception e) {
            throw new DAOException(5);
        }
    }

    @Override
    public Pojo get(Long id) throws DAOException {
        return null;
    }

    @Override
    public List<Pojo> getAll() throws DAOException {
        List<Pojo> resultat = null;
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            TypedQuery<Pojo> query
                    = em.createQuery("SELECT p FROM Pojo p", Pojo.class);
            resultat = query.getResultList();
        } catch (Exception e) {
            throw new DAOException(4);
        } finally {
            em.close();
        }
        return resultat;
    }

    @Override
    public void save(Pojo obj) throws DAOException {
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw new DAOException(3);
        } finally {
            if (em != null) {
                if (em.getTransaction().isActive()) em.getTransaction().rollback();
                em.close();
            }
        }
    }

    @Override
    public List<Pojo> getFromQuery(String query) throws DAOException {
        return null;
    }

    @Override
    public void setFromQuery(String update) throws DAOException {

    }

    @Override
    public void close() throws DAOException {
        try {
            emf.close();
        } catch (Exception e) {
            throw new DAOException(2);
        }
    }

}
