package demo;

import demo.entity.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UsuwanieEncji {

    private static Logger logger = LogManager.getLogger(PobieranieEncjiApp.class);

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit");

    public static void main(String[] args) {

        EntityManager em3 = entityManagerFactory.createEntityManager();

        em3.getTransaction().begin();

        Product product = em3.find(Product.class, 1L);
        em3.remove(product);




        em3.getTransaction().commit();
        em3.close();
    }
}
