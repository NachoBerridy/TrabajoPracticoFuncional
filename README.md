# Trabajo Práctico - Programación Funcional con Java Streams

## Información del Estudiante
- **Nombre:** Ignacio Berridy
- **Legajo:** 50714
- **Materia:** Desarrollo De Software
- **Universidad:** UTN FRM
- **Año:** 2025

## Descripción del Proyecto

Este trabajo práctico implementa cuatro casos prácticos utilizando **Java Streams** y **programación funcional** para demostrar el uso de operaciones como filtrado, mapeo, reducción y agrupación. El objetivo es reemplazar código imperativo por un enfoque declarativo más claro y eficiente.

## Estructura del Proyecto

```
src/
├── main/
│   └── java/
│       └── org/
│           └── example/
│               ├── Main.java              # Clase principal con todos los casos prácticos
│               └── entities/              # Entidades del dominio
│                   ├── Alumno.java
│                   ├── Producto.java
│                   ├── Libro.java
│                   └── Empleado.java
```

## Casos Prácticos Implementados

### 1. Caso Práctico - Clase Alumno(nombre, nota, curso)

**Funcionalidades implementadas:**
- ✅ Obtener nombres de alumnos aprobados (nota ≥ 7) en mayúsculas y ordenados
- ✅ Calcular el promedio general de notas
- ✅ Agrupar alumnos por curso usando `Collectors.groupingBy()`
- ✅ Obtener los 3 mejores promedios

**Objetivos de aprendizaje:**
- Entender el pipeline de Streams
- Usar operaciones de mapeo, filtrado, reducción y agrupación
- Reemplazar código imperativo por un enfoque declarativo

### 2. Caso Práctico - Clase Producto(nombre, categoria, precio, stock)

**Funcionalidades implementadas:**
- ✅ Listar productos con precio mayor a 100, ordenados por precio descendente
- ✅ Agrupar productos por categoría y calcular el stock total
- ✅ Generar String separando con ";" cada producto (nombre y precio) usando `map` + `collect(joining)`
- ✅ Calcular precio promedio general y por categoría

**Objetivos de aprendizaje:**
- Aplicar programación funcional en contexto real
- Generar reportes y estadísticas con Streams
- Consolidar lambdas, collectors y manipulación funcional de listas

### 3. Caso Práctico - Clase Libro(titulo, autor, paginas, precio)

**Funcionalidades implementadas:**
- ✅ Listar títulos de libros con más de 300 páginas, ordenados alfabéticamente
- ✅ Calcular promedio de páginas de todos los libros
- ✅ Agrupar libros por autor y contar cuántos libros tiene cada uno
- ✅ Obtener el libro más caro de la lista

**Objetivos de aprendizaje:**
- Practicar operaciones de `filter`, `map`, `sorted` y `collect`
- Manejar promedios y máximos con Streams
- Entender agrupación con `Collectors.groupingBy()` y `counting()`

### 4. Caso Práctico - Clase Empleado(nombre, departamento, salario, edad)

**Funcionalidades implementadas:**
- ✅ Obtener empleados con salario mayor a 2000, ordenados por salario descendente
- ✅ Calcular salario promedio general
- ✅ Agrupar empleados por departamento y calcular suma de salarios
- ✅ Obtener nombres de los 2 empleados más jóvenes

**Objetivos de aprendizaje:**
- Aplicar operaciones de filtro, ordenamiento y límite
- Calcular promedios y sumatorias con collectors
- Practicar `groupingBy` con downstream collectors (`summingDouble`)

## Tecnologías Utilizadas

- **Java 8+** (Streams API)
- **Gradle** (Sistema de construcción)
- **Collections Framework**
- **Lambda Expressions**
- **Method References**

## Conceptos de Programación Funcional Aplicados

### Operaciones Intermedias
- `filter()` - Filtrado de elementos
- `map()` - Transformación de elementos
- `sorted()` - Ordenamiento
- `limit()` - Limitación de elementos

### Operaciones Terminales
- `collect()` - Recolección con Collectors
- `average()` - Cálculo de promedios
- `max()` - Búsqueda de máximo
- `toList()` - Conversión a lista

### Collectors Utilizados
- `Collectors.toList()` - Recolección en lista
- `Collectors.groupingBy()` - Agrupación
- `Collectors.counting()` - Conteo
- `Collectors.summingInt()` - Suma de enteros
- `Collectors.summingDouble()` - Suma de doubles
- `Collectors.averagingDouble()` - Promedio de doubles
- `Collectors.joining()` - Unión de strings

## Cómo Ejecutar el Proyecto

### Prerrequisitos
- Java 8 o superior
- Gradle (incluido wrapper)

### Compilar y Ejecutar

1. **Clonar o descargar el proyecto**
2. **Navegar al directorio del proyecto**
   ```bash
   cd TrabajoPracticoFuncional
   ```

3. **Compilar el proyecto**
   ```bash
   ./gradlew build
   ```

4. **Ejecutar la aplicación**
   ```bash
   ./gradlew run
   ```

   O alternativamente:
   ```bash
   java -cp build/classes/java/main org.example.Main
   ```

## Ejemplo de Salida

```
Aprobados: [JUAN, LUIS, MARTA]
Promedio general de notas: 7.75
Alumnos agrupados por curso: {Historia=[Ana, Marta], Matemáticas=[Juan, Luis]}
Mejores promedios: [9.0, 8.5, 7.5]

Productos caros: [Laptop - 1200.0, Celular - 800.0, Mesa - 300.0, Silla - 150.0]
Stock por categoría: {Electrónica=15, Muebles=35}
Productos: Laptop - 1200.0; Celular - 800.0; Silla - 150.0; Mesa - 300.0
Precio promedio general: 612.5

...
```

## Conclusiones

Este trabajo práctico demuestra la potencia y elegancia de la **programación funcional** en Java:

- **Código más legible:** Los streams proporcionan un código más declarativo y fácil de entender
- **Menos errores:** Reducción de bucles manuales y gestión de índices
- **Reutilización:** Las operaciones se pueden componer y reutilizar fácilmente
- **Paralelización:** Los streams pueden ejecutarse en paralelo sin cambios en el código
- **Expresividad:** El código expresa claramente la intención del programador

### Ventajas de Streams sobre Código Imperativo

1. **Legibilidad mejorada:** El código se lee como una descripción del problema
2. **Menos propenso a errores:** No hay gestión manual de índices o bucles
3. **Composabilidad:** Las operaciones se pueden encadenar fácilmente
4. **Optimización automática:** La JVM puede optimizar las operaciones de stream

## Autor

**Ignacio Berridy** - Legajo 50714  
UTN Facultad Regional Mendoza  
Tecnicatura Universitaria en Programación a Distancia  
Materia: Desarrollo De Software - 2025
