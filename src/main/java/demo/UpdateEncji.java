package demo;

import demo.entity.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateEncji {

    private static Logger logger = LogManager.getLogger(PobieranieEncjiApp.class);

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("unit");

    public static void main(String[] args) {

        EntityManager em2 = entityManagerFactory.createEntityManager();

        em2.getTransaction().begin();
        /**
         * chcemy zaaktualizowac encje bez jej pobierania
         */
//        Product product = em2.find(Product.class, 1L);
//        product.setName("Rower tandem 2 osobowy");
        Product product = new Product();
        product.setId(1L);
        product.setName("Damka Rower");
        Product merged = em2.merge(product); // dirty checking update dziala bez metody merge
        logger.info(product);

        em2.getTransaction().commit();
        em2.close();
    }
}
