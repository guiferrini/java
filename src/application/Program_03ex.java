package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program_03ex {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Digite o nome do aluno e as 3 notas: ");
		student.nome = sc.nextLine();
		student.a = sc.nextDouble();
		student.b = sc.nextDouble();
		student.c = sc.nextDouble();
		
		System.out.printf("A média final foi: %.2f%n", student.mediaFinal());
		System.out.printf("O situação do aluno " + student.nome + ": " + student.resultadoFinal());
		
		sc.close();
	}

}
