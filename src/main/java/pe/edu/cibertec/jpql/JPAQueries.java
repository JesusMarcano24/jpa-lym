package pe.edu.cibertec.jpql;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import pe.edu.cibertec.entity.Libro;

import java.util.Date;

public class JPAQueries {
    public static void main(String[] args) {
        //referenciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        /**
         * SELECT
         * **/

       // TypedQuery<Libro> query = em.createQuery("select l from Libro l", Libro.class);

        /**
         * SELECT - WHERE
         * **/

        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.autor = :autor", Libro.class);
        //query.setParameter("autor", "Cesar");

        /**
         * SELECT - WHERE - BETWEEN
         * **/

        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.precio between :inicio and :fin", Libro.class);
        //query.setParameter("inicio", 30);
        //query.setParameter("fin", 50);

        /**
         * SELECT - WHERE - IN
         * **/

        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.autor in ('Claudia', 'Cesar')", Libro.class);

        /**
         * SELECT - VALORES ESCALARES
         * **/

        //TypedQuery<String> query = em.createQuery("select l.autor from Libro l where l.autor in ('Claudia', 'Cesar')", String.class);

        /**
         * SELECT - VALORES ESCALARES - DISTINCT
         * **/

        //TypedQuery<String> query = em.createQuery("select distinct upper(l.autor) from Libro l where l.autor in ('Claudia', 'Cesar')", String.class);

        /**
         * SELECT - ORDER BY
         * **/

        //TypedQuery<Libro> query = em.createQuery("select  l from Libro l order by l.precio desc ", Libro.class);

        /**
         * SELECT - GROUP BY
         * **/

        //TypedQuery<Object[]> query = em.createQuery("select l.autor, count(l) from Libro l group by l.autor", Object[].class);

        /**
         * SELECT - IS NULL
         * **/

        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.autor is null", Libro.class);

        /**
         * SELECT - LIKE
         * **/

        TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.titulo LIKE 'c%'", Libro.class);

        /**
         * PRINT
         * **/

        query.getResultList().forEach(System.out::println);

        /**query.getResultList().forEach(elemento -> {
            System.out.println(elemento[0] + " -> " + elemento[1]);
        });**/
    }
}
