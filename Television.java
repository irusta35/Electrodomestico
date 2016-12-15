package com.lessons.entidades;

public class Television extends Electrodomestico {
	// Atributos and constantes
	private int resolucion;
	private boolean sintonizadorTDT;
	private final static int RESOLUCION_DEF = 20;

	public int getresolucion() {
		return resolucion;
	}

	public boolean getsintonizadorTDT() {
		return sintonizadorTDT;
	}

	// Constructores
	public Television(int i, int j, char c, String string, int k, boolean b) {
		super();
		this.resolucion = RESOLUCION_DEF;
	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion = RESOLUCION_DEF;
	}

	public Television(int resolucion, boolean sintonizadorTDT) {
		super();
		this.resolucion = RESOLUCION_DEF;
	}

	public double precioFinal(double precioFinal) {
		double pf = 0;
		if (resolucion >= 40) {
			pf += precioBase * 0.3;
		}
		if (sintonizadorTDT) {
			pf += 50;
		}
		return pf;
	}
}
