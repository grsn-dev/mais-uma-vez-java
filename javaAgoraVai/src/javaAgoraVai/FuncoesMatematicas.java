package javaAgoraVai;

import java.math.BigInteger;
import java.util.Scanner;

public class FuncoesMatematicas {

	public static void main(String[] args) {

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de " + 25 + " = " + C);

		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);

		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

		/*
		 * Scanner entrada = new Scanner(System.in);
		 * 
		 * System.out.println("Digite sua idade: "); double idade = entrada.nextInt();
		 * System.out.println("Digite os 2 primeiros digitos do seu rg sem o zero: ");
		 * double rg = entrada.nextInt(); System.out.println("Equação de segundo grau:"
		 * + " x² + " + (int) idade + "x = " + (int) rg);
		 * 
		 * double DeltaSoma = (-idade + (Math.sqrt((idade * idade)) - 4 * -1 * rg)) / 2
		 * * -1; double DeltaSubtracao = (-idade - (Math.sqrt((idade * idade)) - 4 * -1
		 * * rg)) / 2 * -1;
		 * 
		 * System.out.println("Delta 1: " + (int) DeltaSoma);
		 * System.out.println("Delta 2: " + (int) DeltaSubtracao);
		 * 
		 * double ValorMedio = (DeltaSoma + DeltaSubtracao) / 2;
		 * System.out.println("Valor medio do Delta: " + (int) ValorMedio);
		 */
	}

}
