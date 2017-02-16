/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.lsosab.t02;
import java.util.Scanner;

/**
 *
 * @author Fernanda
 */
public class SPP2LSosaBT02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora de salario por categoria"); 
       Scanner tec = new Scanner (System.in);
		float sue;
		int cate;
		int he;
		float pago=0;
		System.out.println("Ingrese el sueldo base");
		sue = tec.nextFloat();
		System.out.println("Ingrese la categoria del trabajador");
		cate = tec.nextInt();
		while (cate<1 || cate>8) {
			System.out.println("Categoria no valida, ingrese un numero entre 1 y 8");
			cate = tec.nextInt();
			}
		System.out.println("Ingrese las horas extras trabajadas");
		he = tec.nextInt();
		switch (cate) {
			case 1:
			     pago = sue + (he*30);
			break;
			case 2:
			     pago = sue + (he*38);
			break;
			case 3:
			     pago = sue + (he*50);
			break;
			case 4:
			     pago = sue + (he*70);
			break;   
			default:
                        System.out.println("La categorá seleccionada no tiene un valor disponilbe por hora extra");
                            pago= sue;
			}
		System.out.println("El pago final es de: $"+pago);
		}
	} 
    
    

