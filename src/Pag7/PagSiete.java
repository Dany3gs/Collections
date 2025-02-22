package Pag7;

/*
Se desea desarrollar un programa que registre las incidencias detectadas por los
inspectores de calidad de una empresa de automóviles.

La información a registrar será la siguiente:

** Atributos de la clase Incidencias **
-> Código de Incidencia.
-> Código de Inspector.
-> Descripción de incidencia,
-> Fecha de la Incidencia.
-> Nivel de Error.

Ejemplo de un registro sería: 1234, 001A, “Fallo de colocación luneta trasera”, 01/02/2019, Medio.

Para desarrollar este programa se necesita crear una clase denominada Incidencias que contendrá los
atributos y métodos necesarios para controlar y registrar la información.

También se necesita crear otra clase denominada ListarIncidencias que contendrá todos los métodos para
almacenar la lista de incidencias producidas en la empresa de automóviles:

-> Cargar incidencias.
-> Listar incidencias.
-> Añadir valores a la lista.
-> Eliminar valores de la lista.
-> Comprobar sí una incidencia existe o no.

Para el desarrollo de este programa se utilizará la clase ArrayList.
*/

import java.time.LocalDate;

public class PagSiete {

    public static void main(String[] args) {

        // Instanciamos nuevo objeto como lista de incidencias
        ListarIncidencias misIncidencias = new ListarIncidencias();
        
        // Creamos una incidencia usando el método cargarIncidencias y luego la añadimos a la colección
        Incidencias incidencia1 = misIncidencias.cargarIncidencias(1234, 1,
                "Fallo de colocación luneta trasera", LocalDate.of(2019, 2, 1),
                "Medio");
        misIncidencias.anadirIncidencia(incidencia1);

        // Mostramos lista de incidencias
        misIncidencias.listarIncidencias();
        System.out.println("*************************");
        System.out.println("");

        // Creamos más incidencias y mostramos
        misIncidencias.anadirIncidencia(new Incidencias(33,1,"Fuga", LocalDate.now(),"Grave"));
        misIncidencias.anadirIncidencia(new Incidencias(23,3,"Caída", LocalDate.now(),"Media"));
        misIncidencias.anadirIncidencia(new Incidencias(12,4,"Pérdida", LocalDate.now(),"Leve"));
        misIncidencias.anadirIncidencia(new Incidencias(34,5,"Rotura", LocalDate.now(),"Grave"));
        misIncidencias.listarIncidencias();
        System.out.println("");
        System.out.println("*************************");
        
        // Eliminamos la incidencia 33 y listamos, ahora no aparece
        misIncidencias.eliminarIncidencia(33);
        System.out.println("*************************");
        System.out.println("");
        misIncidencias.listarIncidencias();
        
        System.out.println("");
        System.out.println("*************************");
        // Comprobamos si existe la incidencia 1284(no existe)
        misIncidencias.existeIncidencia(1284);
        System.out.println("*************************");

        System.out.println("");

        // Comprobar si existe la incidencia 2345
        misIncidencias.anadirIncidencia(new Incidencias(2345,12,"Fuga", LocalDate.now(),"Grave"));
        misIncidencias.listarIncidencias();
        misIncidencias.existeIncidencia(2345);

        // Comprobar si existe una incidencia
        //misIncidencias.anadirIncidencia(new Incidencias(2345,12,"Fuga", LocalDate.now(),"Grave"));
        misIncidencias.existeIncidencia(12);

    }
}
