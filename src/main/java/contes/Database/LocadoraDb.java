package contes.Database;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import contes.Repository.Automovel;
import contes.Repository.Cliente;
import contes.Repository.Contrato;

public class LocadoraDb {
    
    EntityManagerFactory entityFactory;
    EntityManager entityManager;
    
    public LocadoraDb() {
        entityFactory = Persistence.createEntityManagerFactory("teste");
        entityManager = entityFactory.createEntityManager();
        entityManager.getTransaction().begin();
    }

    public void persist(Contrato contrato) {
        entityManager.persist(contrato);
        entityManager.getTransaction().commit();
    }

    public void persist(Automovel automovel) {
        entityManager.persist(automovel);
        entityManager.getTransaction().commit();
    }

    public void persist(Cliente cliente) {
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();
    }
    
    public void close() {
        entityManager.close();
    }
}
