package pe.edu.cibertec.relaciones;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Categoria;
import pe.edu.cibertec.entity.Libro;

public class JPAOneToManyOrphan {

    //usando orphanRemoval

    public static void main(String[] args) {
        //referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        // Obtener categoria
        Categoria categoria = em.find(Categoria.class, "C1");

        //Obtener Libro
        Libro libro = em.find(Libro.class, "A9");

        //Desasociar libro de categoria
        categoria.getLibros().remove(libro);

        //merge
        em.getTransaction().begin();
        em.merge(categoria);
        em.getTransaction().commit();
    }
}
