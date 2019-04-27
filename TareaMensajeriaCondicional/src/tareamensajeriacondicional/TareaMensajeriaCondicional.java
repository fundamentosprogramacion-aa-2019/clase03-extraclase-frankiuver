/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamensajeriacondicional;

import java.util.Scanner;

/**
 *
 * @author JOSE
 */
public class TareaMensajeriaCondicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nMensajes, dif;
        double mes=3.00, costo=0 ,costofin , tarif = 3.00,   
                tarif2 =0.05*160,iva,adicion;
        String nombre, apellido;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Porfavor Ingrese su nombre: ");
        nombre = entrada.nextLine();

        System.out.print("Porfavor Ingrese su apellido: ");
        apellido = entrada.nextLine();
        
        
        
        System.out.println("Ingrese la cantida de mesajes enviados: ");
        nMensajes = entrada.nextInt();
        System.out.printf("%n Nombre:%s%n Apellido:%s%n ", nombre,apellido);
        System.out.printf(" La catidad de mesajes enviados es:%s%n%n Tarifa mensual:%.2f%n",nMensajes,mes);
        if (nMensajes <= 40) {
            costo = tarif;
        } else {
            if (nMensajes > 40 && nMensajes <= 200) {
                dif = nMensajes - 40;
                costo = tarif + dif * 0.05;
                adicion=dif * 0.05;
                System.out.printf(" Valor adicional :%.2f",adicion);
            } else {
                if (nMensajes > 200) {
                    dif = nMensajes - 200;
                    adicion=tarif2 + dif * 0.10;
                    tarif =tarif+tarif2;//tarifa de 40 + tarifa de 160*0.5
                    costo = tarif + dif * 0.10;
                    
                    System.out.printf(" Valor adicional:%.2f",adicion);
                }

            }
        }
        iva=costo*0.12;
        costofin=costo+iva;
        System.out.printf("%n Total inicial:%.2f%n IVA:%.2f%n Costo final-total:%.2f%n",costo,iva,costofin);
        
    }
}
