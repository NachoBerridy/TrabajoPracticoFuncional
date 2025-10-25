package org.example.entities;
import java.util.*;
import java.util.stream.Collectors;

public class Alumno {
    String nombre;
    double nota;
    String curso;

    public Alumno(String nombre, double nota, String curso) {
        this.nombre = nombre;
        this.nota = nota;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota() {
        return nota;
    }

    public String getCurso() {
        return curso;
    }
}


