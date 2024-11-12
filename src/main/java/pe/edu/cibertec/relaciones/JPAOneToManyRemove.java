package pe.edu.cibertec.relaciones;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Categoria;
import pe.edu.cibertec.entity.Libro;

import java.util.Arrays;
import java.util.Date;

public class JPAOneToManyRemove {
    public static void main(String[] args) {
        //referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        // Obtener categoria
        Categoria categoria = em.find(Categoria.class, "C1");

        //Persist
        em.getTransaction().begin();
        em.remove(categoria);
        em.getTransaction().commit();
    }
}
