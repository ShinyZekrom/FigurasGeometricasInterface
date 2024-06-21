package org.generation;

public class Cuadrado implements FiguraGeometrica{
	private String nombre;
	private double lado;
	
	public Cuadrado(String nombre, double lado) {
		super();
		this.nombre = nombre;
		this.lado = lado;
	}//constructor

	
	//Get and Set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	
	@Override
	public String toString() {
		return "Cuadrado [nombre=" + nombre + ", lado=" + lado + "]";
	}
	//toString


	@Override
	public double calcularArea() {
		return (lado*lado);
	}//calcularArea
	
	@Override
	public double calcularPerimetro() {
		return (lado*4);
	}//calcularPerimetro
	
	
}//class cuadrado
