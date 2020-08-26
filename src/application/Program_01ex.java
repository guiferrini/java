package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class Program_01ex {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle retangle = new Retangle();
		
		System.out.println("Digite a largura e altura do retangulo: ");
		retangle.altura = sc.nextDouble();
		retangle.largura = sc.nextDouble();
		
		//System.out.print("Area = " + retangle.Area());
		System.out.printf("Area = %.2f%n", retangle.Area());
		//System.out.println();
		System.out.printf("Perimetro = %.2f%n", retangle.Perimetro());
		System.out.printf("Diagonal = %.2f%n", retangle.Diagonal());
		 
		sc.close();
	}

}
