/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraclasecondicionales;

import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class ExtraClaseCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matricula = 1200, edad;
        double descuento = 0, totalmatricula;
        String nombre, apellido, DescLoja = "Loja", DescZamora = "Zamora",
                nombre_ciudad, EstadoCivil = "Casado", ecivil;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Porfavor Ingrese su ciudad: ");
        nombre_ciudad = entrada.nextLine();

        System.out.print("Porfavor Ingrese su nombre: ");
        nombre = entrada.nextLine();

        System.out.print("Porfavor Ingrese su apellido: ");
        apellido = entrada.nextLine();

        System.out.print("Porfavor Ingrese su estado civil: ");
        ecivil = entrada.nextLine();

        System.out.print("Porfavor Ingrese su edad: ");
        edad = entrada.nextInt();

        if (nombre_ciudad.equalsIgnoreCase(DescLoja)
                || nombre_ciudad.equalsIgnoreCase(DescZamora)) {
            descuento = descuento + matricula * 0.20;
        }
        if ((edad >= 17) && (edad < 20)) {
            descuento = descuento + matricula * 0.10;

        }

        if (ecivil.equalsIgnoreCase(EstadoCivil)) {
            descuento = descuento + matricula * 0.05;
        }
        totalmatricula = matricula - descuento;
        totalmatricula = totalmatricula + matricula * 0.02;

        System.out.printf("%n Ciudad:%s%n Nombre:%s%n Apellido:%s%n Edad:%d%n "
                + "Estado civil:%s%n Valor de la matricula:%d%n Descuento:%.2f%n "
                + "Valor total de la matricula:% .2f%n", nombre_ciudad, nombre,
                apellido, edad, ecivil, matricula, descuento, totalmatricula);

    }

}
