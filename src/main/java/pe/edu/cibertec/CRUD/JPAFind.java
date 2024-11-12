package pe.edu.cibertec.CRUD;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Libro;

public class JPAFind {
    public static void main(String[] args) {
        //referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        //Obtener libro
        Libro libro = em.find(Libro.class, "A2");
        System.out.println(libro);
    }
}
