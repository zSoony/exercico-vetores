package application;

import java.util.Locale;
import java.util.Scanner;

import entitties.product;

public class Program {

	
	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println( "insira a quantidade de elementos do vetor");
	   
	   int n = sc.nextInt();
	   product[] vect = new product[n];
	   
	   System.out.println("insira os dados do vetor" );
	   
	   for (int i=0; i <vect.length; i++) {
		   sc.nextLine();
		   String name = sc.nextLine();
		   double price = sc.nextDouble();
		   vect[i] = new product (name, price);
	   }
	   
	   double sum = 0.0;
	   for (int i=0; i<vect.length; i++) {
		   sum += vect[i].getPrice();
	   }
	   
	   double avg = sum / n;
	   
	   System.out.printf("AVERAGE PRICE = %.2f%n ", avg);
		
	   
	   sc.close();
	}

}
