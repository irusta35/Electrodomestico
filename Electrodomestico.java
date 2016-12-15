package com.lessons.entidades;

//atributos
public class Electrodomestico {
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	protected final static String COLOR_DEF = "blanco";
	protected final static char CONSUMO_ENERGETICO_DEF = 'F';
	protected final static double PRECIO_BASE_DEF = 100;
	protected final static double PESO_DEF = 5;

	public double getPreciobase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	// constructores
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE_DEF;
		this.peso = PESO_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		this.color = COLOR_DEF;
	}

	public Electrodomestico(double preciobase, double peso) {
		this.precioBase = preciobase;
		this.peso = peso;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		this.color = COLOR_DEF;
	}

	public Electrodomestico(double preciobase, double peso, char consumoenergetico, String color) {
		this.precioBase = preciobase;
		this.peso = peso;
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
		this.color = comprobarColor(color);
	}

	private String comprobarColor(String color) {
		// String colores[] = { "blanco", "negro", "rojo", "azul", "gris"};
		if (!color.equals("blanco") && !color.equals("negro") && !color.equals("rojo") && !color.equals("azul")
				&& !color.equals("gris")) {
			return COLOR_DEF;
		} else {
			return color;
		}
	}

	private char comprobarConsumoEnergetico(char consumoEnergetico) {
		if (consumoEnergetico != 'A' && consumoEnergetico != 'F')
			return CONSUMO_ENERGETICO_DEF;
		else
			return consumoEnergetico;
	}

	public double precioFinal() {
		double pf = 0;
		switch (this.consumoEnergetico) {
		case 'A':
			pf = 100;
			break;
		case 'B':
			pf = 80;
			break;
		case 'c':
			pf = 60;
			break;
		case 'd':
			pf = 50;
			break;
		case 'e':
			pf = 30;
			break;
		case 'f':
			pf = 10;
			break;
		}
		if (peso >= 0 && peso < 19) {
			pf += 10;
		} else if (peso >= 20 && peso < 49) {
			pf += 50;
		} else if (peso >= 50 && peso <= 79) {
			pf += 80;
		} else if (peso >= 80) {
			pf += 100;
		}

		return precioBase + pf;
	}
}
