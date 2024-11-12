package pe.edu.cibertec.CRUD;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Libro;

import java.util.Date;

public class JPAPersist {
    public static void main(String[] args) {
        //referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        //Create libro
        Libro libro = new Libro("A3", "example titulo", "Autor Example", 50.45 , new Date(), null );

        //persist
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
    }
}
