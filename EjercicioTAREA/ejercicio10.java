package EjercicioTAREA;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double angulo_en_grados, radianes, seno;
        System.out.print("Ingresa el valor de angulo en grados: ");
        angulo_en_grados = in.nextDouble();
        in.nextLine();
        radianes=angulo_en_grados*Math.PI/180;
        seno=Math.sin(radianes);
        System.out.println("Valor de radianes: " + radianes);
        System.out.println("Valor de seno: " + seno);
    }

