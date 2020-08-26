package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.next();		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
		
		System.out.println();		
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.print("Entre com o n° de produtos para adicionar no estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println();		
		System.out.println("Update data: " + product);
		
		System.out.println();
		System.out.print("Entre com o n° de produtos para retirar no estoque: ");
		int remove = sc.nextInt(); //quantity = sc.nextInt() reutiliza a variavel
		product.removeProducts(remove);;
		System.out.println();		
		System.out.println("Update data: " + product);
		
		sc.close();
	}

}
