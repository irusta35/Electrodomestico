package com.lessons.entidades;

public class Calculadora implements Icalculadora {
	public int sumar(int n1, int n2){
		return n1 + n2;
	}

	@Override
	public int restar(int n1, int n2) {
		return n2;
		
	}

	@Override
	public int multiplicar(int n1, int n2) {
		return n2;
		
	}

	@Override
	public int dividir(int n1, int n2) {
		return n2;
		
	}

	
}
