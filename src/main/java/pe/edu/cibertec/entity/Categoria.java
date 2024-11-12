package pe.edu.cibertec.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Categoria {

    @Id
    private String codigo;
    private String nombre;

    //orphanRemoval asegura que no tengamos un hijo sin clave foranea
    @OneToMany(mappedBy = "categoria", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<Libro> libros;

    public Categoria() {}

    @Override
    public String toString() {
        return "Categoria{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public Categoria(String codigo, String nombre, List<Libro> libros) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.libros = libros;
    }
}
