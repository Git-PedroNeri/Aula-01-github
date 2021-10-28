package br.com.application.figurasgeometricas;

import java.math.BigDecimal;

public class Triangulo extends FiguraGeometrica {

	private final int qtdLados = 3;

	@Override
	BigDecimal calcularArea(int... lados) {

		if (lados.length <= 2) {

			int base = lados[0];
			int altura = lados[1];
			return BigDecimal.valueOf(base * altura / 2);
		} else
			return BigDecimal.ZERO;
	}

}
