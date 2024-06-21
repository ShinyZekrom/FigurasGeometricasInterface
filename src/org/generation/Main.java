package org.generation;

public class Main {

	public static void main(String[] args) {
		Triangulo bermudas = new Triangulo("Bermudas", 20, 10, 15);
		Triangulo t = new Triangulo("TrianguloTE", 250, 175, 145);
		imprimirCalculo(bermudas);
		imprimirCalculo(t);
		
		Cuadrado square1 = new Cuadrado("Square1", 10);
		imprimirCalculo(square1);
		
		Rectangulo rect1 = new Rectangulo("Rect1", 20, 30);
		imprimirCalculo(rect1);
		
		Rombo romb1 = new Rombo ("Romb1", 15, 20, 30);
		imprimirCalculo(romb1);
		
		Romboide romboid1 = new Romboide ("Romboid1", 15, 30);
		imprimirCalculo(romboid1);
		
		Trapecio trap1 = new Trapecio ("Trap1", 10, 15, 17, 20, 30, 20, 10);
		imprimirCalculo(trap1);
	}//main
	
	public static void imprimirCalculo(FiguraGeometrica triangulo) {
		System.out.println(triangulo.toString());
		System.out.println("+===================================================");
		System.out.println("| El area de [" + triangulo.getNombre() + "] es : " + triangulo.calcularArea());
		System.out.println("| El perimetro de [" + triangulo.getNombre() + "] es : " + triangulo.calcularPerimetro());
		System.out.println("+===================================================");
	}//imprimirCalculo

}//class Main
