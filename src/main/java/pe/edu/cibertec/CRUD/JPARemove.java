package pe.edu.cibertec.CRUD;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Libro;

import java.util.Date;

public class JPARemove {
    public static void main(String[] args) {
        //referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        //Obtener libro
        Libro libro = em.find(Libro.class, "A3");

        //persist
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
    }
}
