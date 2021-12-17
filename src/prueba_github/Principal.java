package prueba_github;

class Principal{
	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println(suma(4, 5));
		System.out.println(resta(2, 1));
	}
	
	public static int suma (int a, int b) {
		return a+b;
	}
	public static int resta (int a, int b) {
		return a-b;
	}
}
