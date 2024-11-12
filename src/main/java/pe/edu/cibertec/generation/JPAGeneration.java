package pe.edu.cibertec.generation;

import jakarta.persistence.Persistence;

public class JPAGeneration {
    public static void main(String[] args) {
        // Regenerar el schema de la DB usando los logs del persistence
        Persistence.generateSchema("biblioteca", null);
    }
}
