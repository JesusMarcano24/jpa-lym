package pe.edu.cibertec.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="libros")
public class Libro {

    @Id
    private String isbn;
    private String titulo;
    private String autor;
    private Date fecha;
    private Double precio;
    @ManyToOne
    @JoinColumn(name = "codigo_categoria")
    private Categoria categoria;

    public Libro() {
    }

    public Libro(String isbn) {
        this.isbn = isbn;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Libro(String isbn, String titulo, String autor, Double precio, Date fecha, Categoria categoria) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.fecha = fecha;
        this.categoria = categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", fecha=" + fecha +
                ", precio=" + precio +
                '}';
    }
}
