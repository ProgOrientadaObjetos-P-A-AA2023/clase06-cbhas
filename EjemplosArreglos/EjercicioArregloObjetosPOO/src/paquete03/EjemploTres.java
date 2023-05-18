/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.*;

public class EjemploTres {
    public static void main(String[] args) {
        Profesor p1 = new Profesor("Luis A", "nombramiento");
        Profesor p2 = new Profesor("Ana A", "contrato");
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion [] calificaciones = {new Calificacion(10, "Computación", p1), 
            new Calificacion(9, "Electrónica", p2)};
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota(),
                    objetoCalificacion.obtenerProfesor().obtenerNombre());
        }
        
    }
}
