package br.com.generation.atividade1;

import java.util.Scanner;

public class LacoDeDecisao02 {

	public static void main(String[] args) {
			 
			Scanner entrada = new Scanner(System.in);
			
			int n1, n2, n3;
			
		  System.out.println("Digite o 1� n�mero: ");
		  n1 = entrada.nextInt();
		  
		  System.out.println("Digite o 2� n�mero: ");
		  n2 = entrada.nextInt();
		  
		  System.out.println("Digite o 3� n�mero: ");
		  n3 = entrada.nextInt();
		  
		  if(n1 < n2 || n2 < n3) {
		    System.out.println( n1 + "-" + n2 + "-" + n3);
		    
		  }
		  else if( n1 < n3) {
			  System.out.println(n1 + "-" + n3 + "-" + n2);
		  
		  }
		  else {
			  System.out.println(n3 + "-" + n1 + "-" + n2);
			  
  
		  }
		    
		  if(n2 < n3) {
				  System.out.println( n2 + "-" + n1 + "-" + n3);
		  }
			  
		  else if( n1< n3) {
			  System.out.println(n2 + "-" + n3 + "-" + n1);
		  }
		  
		  else{
			  System.out.println(n3+ "-" + n2 + "-" + n1);
		  
		  }

	}

}
