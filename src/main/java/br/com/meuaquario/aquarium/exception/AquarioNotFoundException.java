package br.com.meuaquario.aquarium.exception;

public class AquarioNotFoundException extends RuntimeException {
	public AquarioNotFoundException (String message) {
		super(message);
	}

}
