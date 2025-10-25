package org.example;

import org.example.entities.Alumno;
import org.example.entities.Producto;
import org.example.entities.Libro;
import org.example.entities.Empleado;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Caso Práctico 1: Alumno
        List<Alumno> alumnos = Arrays.asList(
                new Alumno("Juan", 8.5, "Matemáticas"),
                new Alumno("Ana", 6.0, "Historia"),
                new Alumno("Luis", 9.0, "Matemáticas"),
                new Alumno("Marta", 7.5, "Historia")
        );

        List<String> aprobados = alumnos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(a -> a.getNombre().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Aprobados: " + aprobados);

        double promedioNotas = alumnos.stream()
                .mapToDouble(Alumno::getNota)
                .average()
                .orElse(0);
        System.out.println("Promedio general de notas: " + promedioNotas);

        Map<String, List<Alumno>> alumnosPorCurso = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));
        System.out.println("Alumnos agrupados por curso: " + alumnosPorCurso);

        List<Double> mejoresPromedios = alumnos.stream()
                .map(Alumno::getNota)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Mejores promedios: " + mejoresPromedios);

        // Caso Práctico 2: Producto
        List<Producto> productos = Arrays.asList(
                new Producto("Laptop", "Electrónica", 1200, 5),
                new Producto("Celular", "Electrónica", 800, 10),
                new Producto("Silla", "Muebles", 150, 20),
                new Producto("Mesa", "Muebles", 300, 15)
        );

        List<Producto> productosCaros = productos.stream()
                .filter(p -> p.getPrecio() > 100)
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .collect(Collectors.toList());
        System.out.println("Productos caros: " + productosCaros);

        Map<String, Integer> stockPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.summingInt(Producto::getStock)));
        System.out.println("Stock por categoría: " + stockPorCategoria);

        String productosString = productos.stream()
                .map(p -> p.getNombre() + " - " + p.getPrecio())
                .collect(Collectors.joining("; "));
        System.out.println("Productos: " + productosString);

        double precioPromedioGeneral = productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0);
        System.out.println("Precio promedio general: " + precioPromedioGeneral);

        Map<String, Double> precioPromedioPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.averagingDouble(Producto::getPrecio)));
        System.out.println("Precio promedio por categoría: " + precioPromedioPorCategoria);

        // Caso Práctico 3: Libro
        List<Libro> libros = Arrays.asList(
                new Libro("Libro A", "Autor 1", 350, 20.5),
                new Libro("Libro B", "Autor 2", 200, 15.0),
                new Libro("Libro C", "Autor 1", 400, 25.0),
                new Libro("Libro D", "Autor 3", 150, 10.0)
        );

        List<String> titulosLibros = libros.stream()
                .filter(l -> l.getPaginas() > 300)
                .map(Libro::getTitulo)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Títulos de libros con más de 300 páginas: " + titulosLibros);

        double promedioPaginas = libros.stream()
                .mapToInt(Libro::getPaginas)
                .average()
                .orElse(0);
        System.out.println("Promedio de páginas: " + promedioPaginas);

        Map<String, Long> librosPorAutor = libros.stream()
                .collect(Collectors.groupingBy(Libro::getAutor, Collectors.counting()));
        System.out.println("Libros por autor: " + librosPorAutor);

        Libro libroMasCaro = libros.stream()
                .max(Comparator.comparingDouble(Libro::getPrecio))
                .orElse(null);
        System.out.println("Libro más caro: " + libroMasCaro);

        // Caso Práctico 4: Empleado
        List<Empleado> empleados = Arrays.asList(
                new Empleado("Juan", "IT", 2500, 30),
                new Empleado("Ana", "HR", 1800, 25),
                new Empleado("Luis", "IT", 3000, 35),
                new Empleado("Marta", "Finance", 2200, 28)
        );

        List<Empleado> empleadosConSalarioAlto = empleados.stream()
                .filter(e -> e.getSalario() > 2000)
                .sorted(Comparator.comparingDouble(Empleado::getSalario).reversed())
                .collect(Collectors.toList());
        System.out.println("Empleados con salario alto: " + empleadosConSalarioAlto);

        double salarioPromedio = empleados.stream()
                .mapToDouble(Empleado::getSalario)
                .average()
                .orElse(0);
        System.out.println("Salario promedio general: " + salarioPromedio);

        Map<String, Double> salarioPorDepartamento = empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getDepartamento, Collectors.summingDouble(Empleado::getSalario)));
        System.out.println("Salario por departamento: " + salarioPorDepartamento);

        List<String> empleadosMasJovenes = empleados.stream()
                .sorted(Comparator.comparingInt(Empleado::getEdad))
                .limit(2)
                .map(Empleado::getNombre)
                .collect(Collectors.toList());
        System.out.println("Empleados más jóvenes: " + empleadosMasJovenes);
    }
}