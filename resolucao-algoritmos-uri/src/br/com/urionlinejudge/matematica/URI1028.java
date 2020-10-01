package br.com.urionlinejudge.matematica;

import java.util.Scanner;

//Resolvido usando o Algoritmo de Euclides 
//maneira mais eficiente de encontrar o MDC de dois numeros
// "https://pt.wikipedia.org/wiki/Algoritmo_de_Euclides"

public class URI1028 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int numCasos = scan.nextInt();
	        int a, b;
	        for(int i = 0; i < numCasos; i++){
	            a = scan.nextInt();
	            b = scan.nextInt();
	            
	            while(b!=0){
	                int resto = a % b;
	                a = b;
	                b = resto;
	            }
	            
	            System.out.println(a);
	        }
	}

}
