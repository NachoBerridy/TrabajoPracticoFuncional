package org.example.entities;
import java.util.*;
import java.util.stream.Collectors;

public class Libro {
    String titulo;
    String autor;
    int paginas;
    double precio;

    public Libro(String titulo, String autor, int paginas, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public double getPrecio() {
        return precio;
    }
}