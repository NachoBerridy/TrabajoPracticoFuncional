package org.example.entities;
import java.util.*;
import java.util.stream.Collectors;

public class Empleado {
    String nombre;
    String departamento;
    double salario;
    int edad;

    public Empleado(String nombre, String departamento, double salario, int edad) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public int getEdad() {
        return edad;
    }
}