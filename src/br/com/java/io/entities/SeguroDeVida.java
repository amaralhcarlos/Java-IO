package br.com.java.io.entities;

import br.com.java.io.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		return 42;
	}

}
