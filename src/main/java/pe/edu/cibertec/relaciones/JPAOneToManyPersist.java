package pe.edu.cibertec.relaciones;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Categoria;
import pe.edu.cibertec.entity.Libro;

import java.util.Arrays;
import java.util.Date;

public class JPAOneToManyPersist {
    public static void main(String[] args) {
        //referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        // Crear categoria
        Categoria categoria = new Categoria("C100", "Categoria", null);

        // Crear libros

        Libro libro1 = new Libro("A101", "Titulo", "Autor", 50.50, new Date(), categoria);
        Libro libro2 = new Libro("A102", "Titulo", "Autor", 50.50, new Date(), categoria);
        Libro libro3 = new Libro("A103", "Titulo", "Autor", 50.50, new Date(), categoria);

        //Agregar los libros a la categoria
        categoria.setLibros(Arrays.asList(libro1, libro2, libro3));

        //Persist
        em.getTransaction().begin();
        em.persist(categoria);
        em.getTransaction().commit();
    }
}
