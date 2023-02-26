package javaAgoraVai;

import java.text.NumberFormat;

public class FormataNumeroDouble {

	public static void main(String[] args) {

		double valor = 1234567.89;
		
		/* obtem uma instância das configfurações regionais */
		NumberFormat nf = NumberFormat.getInstance(); 
		
		/* método format, para formatar o original */
		String valorFormatado = nf.format(valor);
		
		System.out.println("Formatado: " + valorFormatado);

	}

}
/*
 * https://www.arquivodecodigos.com.br/dicas/2793-java-como-obter-o-tamanho-de-um-arquivo-em-bytes-usando-o-metodo-length-da-classe-randomaccessfile.html
 */
 
