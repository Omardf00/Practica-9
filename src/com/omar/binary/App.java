package com.omar.binary;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer n = null;
		Integer programa = null;
		Integer[] array = null;
		Integer x = null;
		Integer range = null;
		Boolean comprobation = null;

		System.out.println("En este programa generaremos un vector de longitud n, la cual pediremos al usuario.");
		System.out.println("Tras ello, se lo mostraremos al usuario y le pediremos que introduzca un número para que lo busque en el mismo.");
		System.out.println("También implementaremos un segundo programa que hará lo mimso pero con un array de 25.000.000 de longitud.");
		
		try {
			
			System.out.println("Por favor, elija el programa que quiere ejecutar (1) ó (2)");
			programa = sc.nextInt();
			
			switch (programa) {
			case 1:
				System.out.println("Por favor, introduzca el número correspondiente a la longitud del array.");
				n=sc.nextInt();
				
				System.out.println("Este es su array generado con valores entre 1 y 10");
				range = 10;
				array = Arreglos.generarArray(n, range);
				System.out.println(Arreglos.impirmirArray(array));
				
				System.out.println("Introduzca el número que quiere comprobar:");
				x = sc.nextInt();
				
				comprobation = Arreglos.comprobarArray(array, x);
				
				if (comprobation == true) {
					System.out.println("El número está dentro del arreglo");
				}else {
					System.out.println("El número no está dentro del arreglo");
				}
				
				break;
			case 2:
				n = 25000000;
				
				System.out.println("No imprimiremos el array por cuestiones de tiempo, pero se generará con valores de entre 1 y 1000000");
				range = 1000000;
				array = Arreglos.generarArray(n, range);
				
				System.out.println("Introduzca el número que quiere comprobar:");
				x = sc.nextInt();
				
				comprobation = Arreglos.comprobarArray(array, x);
				
				if (comprobation == true) {
					System.out.println("El número está dentro del arreglo");
				}else {
					System.out.println("El número no está dentro del arreglo");
				}
				
				break;
			default:
				System.out.println("Solo puede elegir entre el programa (1) ó (2)");
				break;
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Por favor introduzca números enteros");
		}
	}

}
