package br.com.meuaquario.aquarium.exception;

public class PeixeNotFoundException extends RuntimeException {
	public PeixeNotFoundException (String message) {
		super(message);
	}

}
