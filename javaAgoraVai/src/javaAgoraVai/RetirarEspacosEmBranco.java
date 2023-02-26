package javaAgoraVai;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RetirarEspacosEmBranco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String padrao = "\\s";
		
		Pattern regPat = Pattern.compile(padrao);
		
		
		
//		String frase = "Gerson Bueno de Moraes";
		System.out.println("DIgite uma frase: ");
		String frase = sc.nextLine();
		
		Matcher matcher = regPat.matcher(frase);
		
		String res = matcher.replaceAll("");
		
		System.out.println("Espaços retirados: " + res);
	}

}
