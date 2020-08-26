package entities;

public class Student {
	public double a;
	public double b;
	public double c;
	public String nome;
	
	public double mediaFinal() {
		return (a + b + c)/3;
	}
	
	public String resultadoFinal() {
		if (mediaFinal()>=6) {
			return "Pass";
		} else {
			double missing = 6 - mediaFinal();
			return "Failed. "
				+ "Missing "
				+ String.format("%.2f", missing)
				+ " Pontos.";
		}
	}
	
}
