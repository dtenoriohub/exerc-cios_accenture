package Sample_04.calcularRetanguloCirculo;

import javax.swing.JOptionPane;

public class Retangulo {

	private double lado1;
	private double lado2;
	private double area;
	private double perimetro;
	private int numRetangulo;
	
	
	public Retangulo() {
	}
	
	public Retangulo(double lado1,double lado2) {
		setLado1(lado1);
		setLado2(lado2);
		
	}
	
	public void calculateArea() {
		setArea(getLado1()*getLado2());
		JOptionPane.showMessageDialog(null,"area do retangulo: "+ getArea());
	}
	
	public void calculatePerimeter() {
		setPerimetro((2*getLado1())+(2*getLado2()));
		JOptionPane.showMessageDialog(null,"perimetro do retangulo: "+ getPerimetro());
		
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	
	
}
