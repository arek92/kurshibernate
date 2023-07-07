package demo;

import demo.entity.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PobieranieEncjiApp {

    private static Logger logger = LogManager.getLogger(PobieranieEncjiApp.class);

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit");

    public static void main(String[] args) {

        EntityManager em1 = entityManagerFactory.createEntityManager();

        em1.getTransaction().begin();
        Product product = em1.find(Product.class, 1L);
        logger.info("Our founded product is : " + " " + product);

        em1.getTransaction().commit();
        em1.close();


    }
}
