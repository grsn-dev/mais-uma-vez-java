package javaAgoraVai;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
/*		
		String nome;
		System.out.println("Digite um nome: " );
		nome = sc.next();
		System.out.println("Nome é: " + nome);
		
		int numint;
		System.out.println("Digite um número: " );
		numint =sc.nextInt();
		System.out.println("Número é " + numint);
		System.out.println("... ");
		
		
		double numdouble;
		System.out.println("Digite um double: " );		
		numdouble=sc.nextDouble(); // formato double pt_BR, com virgula na entrada
		System.out.printf("o double é: %.2f%n", numdouble ); // imprimir com virgula

		double numdouble2;
		System.out.println("Digite um double: " );		
		numdouble2=sc.nextDouble(); // formato US, com ponto na entrada
		System.out.printf("o double é: %.2f%n", numdouble2 ); // imprimir com virgula
		
		
		char caracter;
		System.out.println("Digite um car: " );		;
		caracter=sc.next().charAt(0);
		System.out.println("O Char é: " + caracter);
	
*/

		String x;
		int y;
		double z;
		x =  sc.next();
		y = sc.nextInt();
		z =sc.nextDouble();
		System.out.println("Dados digitados :");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		sc.close();
	}

}
