package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		// celsius para fahrenheit (Fº -32 x 5/9) = Cº
		
		double firenh = 0;
		final double fixa = 32;
		final double fator = 5/9.0;
		double celsius = (firenh-fixa)*fator;
		
		System.out.println("Temperatura é: "+celsius+"º");
		
	}

}
