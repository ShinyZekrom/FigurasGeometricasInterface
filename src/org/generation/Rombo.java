package org.generation;

public class Rombo implements FiguraGeometrica{
	private String nombre;
	private double lado;
	private double diagonalmen;
	private double diagonalmay;
	
	public Rombo(String nombre, double lado, double diagonalmen, double diagonalmay) {
		super();
		this.nombre = nombre;
		this.lado = lado;
		this.diagonalmen = diagonalmen;
		this.diagonalmay = diagonalmay;
	}//constructor

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

	public double getDiagonalmen() {
		return diagonalmen;
	}

	public void setDiagonalmen(double diagonalmen) {
		this.diagonalmen = diagonalmen;
	}

	public double getDiagonalmay() {
		return diagonalmay;
	}

	public void setDiagonalmay(double diagonalmay) {
		this.diagonalmay = diagonalmay;
	}

	@Override
	public String toString() {
		return "Rombo [nombre=" + nombre + ", lado=" + lado + ", diagonalmen=" + diagonalmen + ", diagonalmay="
				+ diagonalmay + "]";
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return (diagonalmay*diagonalmen)/2;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return (lado*4);
	}
	
	
}// class rombo
