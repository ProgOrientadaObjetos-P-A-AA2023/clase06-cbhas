/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.Scanner;
import paquete01.LibretaCalificacion;
import paquete04.Colegio;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        // listado de variables para ingreso de datos por teclado
        Scanner entrada = new Scanner(System.in);
        String nombreEstudiante;
        String nombreColegio;
        String ciudadColegio;
        double[] calificacionesEstudiante;
        int numerocalificaciones;

        // Ingreso de valores por teclado
        System.out.println("Ingrese el nombre del colegio");
        nombreColegio = entrada.nextLine();
        System.out.println("Ingrese la ciudad del colegio");
        ciudadColegio = entrada.nextLine();
        Colegio c = new Colegio(nombreColegio,
                ciudadColegio);
        System.out.println("Ingrese el nombre del estudiante");
        nombreEstudiante = entrada.nextLine();
        System.out.println("Ingrese el número de calificaciones");
        numerocalificaciones = entrada.nextInt();
        calificacionesEstudiante = new double[numerocalificaciones];

        for (int i = 0; i < numerocalificaciones; i++) {
            System.out.printf("Ingrese calificación %d\n", i + 1);
            calificacionesEstudiante[i] = entrada.nextDouble();
        }

        LibretaCalificacion libreta = new LibretaCalificacion(
                nombreEstudiante,
                calificacionesEstudiante,
                c);

        libreta.establecerPromedio();
        libreta.establecerPromedioCualitativo();
        System.out.printf("\n%s\n", libreta);
    }
}
