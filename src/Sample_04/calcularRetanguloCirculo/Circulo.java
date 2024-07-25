package Sample_04.calcularRetanguloCirculo;

import javax.swing.JOptionPane;

public class Circulo {
	
	private double raio;
	private double area;
	private double perimetro;
	private static final float PI = 3.14f;
	
	
	public Circulo() {
	}
	
	public Circulo(double raio) {
		this.raio = raio;
		
	}
	
	public void calcularArea() {
		setArea(getRaio()*getRaio()*PI);
		JOptionPane.showMessageDialog(null,"area do circulo: "+getArea());
	}
	public void calcularPerimetro() {
		setPerimetro(2*PI*getRaio());
		JOptionPane.showMessageDialog(null,"Perimetro do circulo: "+getPerimetro());

	}
	
	
//==============================================================
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
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
