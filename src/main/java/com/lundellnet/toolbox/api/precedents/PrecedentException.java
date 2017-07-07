package com.lundellnet.toolbox.api.precedents;

public class PrecedentException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PrecedentException() {}
	
	public PrecedentException(String msg) {
		super(msg);
	}
	
	public PrecedentException(Throwable ex) {
		super(ex);
	}
	
	public PrecedentException(String msg, Throwable ex) {
		super(msg, ex);
	}
}
