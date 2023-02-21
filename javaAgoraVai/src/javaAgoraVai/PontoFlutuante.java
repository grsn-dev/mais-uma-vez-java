package javaAgoraVai;

import java.util.Locale;

public class PontoFlutuante {

	public static void main(String[] args) {
		
		double x = 10.35784;

		System.out.println(x);
	
//		imprimir com duas casas
//		 "printf" é de formatado
		System.out.printf("%.2f%n", x); 
		
//		ajuste para imprimir com o ponto
		Locale.setDefault(Locale.US);   
		System.out.printf("%.4f%n", x);
		
		
	}

}