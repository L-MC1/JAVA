package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		double raio = 3.4;
		// final é pra definir a var em const
		final double pi = 3.14159;
		
		raio = 10;
		
		double area = pi*raio*raio;
		System.out.println("Area é: "+area+"m².");
		
	}

}
