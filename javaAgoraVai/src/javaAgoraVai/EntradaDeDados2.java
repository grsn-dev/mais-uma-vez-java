package javaAgoraVai;

import java.util.Scanner;

public class EntradaDeDados2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
/*		
		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
	                      
		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
*/
		int n1;
		String s1, s2, s3;
		
		n1 = sc.nextInt();
		sc.nextLine();     // consumir a quebra de linha diferen do nextLine, o de cima é nextInt
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(n1);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		
		
		sc.close();
	}

}
