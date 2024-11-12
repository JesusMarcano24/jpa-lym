package pe.edu.cibertec.relaciones;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.entity.Categoria;

public class JPAOneToMany {
    public static void main(String[] args) {
        //referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        Categoria categoria = em.find(Categoria.class, "C1");

        //Mostrar resultados
        categoria.getLibros().forEach(System.out::println);
    }
}
