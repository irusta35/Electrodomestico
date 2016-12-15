package com.lessons.entidades;

public class Lavadora extends Electrodomestico {
	protected int carga;
	protected final static int CARGA_DEF = 5;

	public int getcarga() {
		return carga;
	}

	public Lavadora(int i, int j, char c, String string, int k) {
		super();
		this.carga = CARGA_DEF;
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		this.carga = CARGA_DEF;
	}

	public Lavadora(int carga) {
		super();
		this.carga = CARGA_DEF;
	}

	public double precioFinal(double precioFinal) {
		double pf = 0;
		if (carga >= 30) {
			pf += 50;
		} else if (carga <= 30) {
			pf += 0;
		}
		return pf;
	}
}
