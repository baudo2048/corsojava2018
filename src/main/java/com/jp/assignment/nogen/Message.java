package com.jp.assignment.nogen;

public abstract class Message {
	public abstract MessageType getType();
	public abstract int getQuantity();
	public abstract OperationType getOp();
	
	private Sale sale;

	public Sale getSale() {
		return sale;
	}

	public void setSale(Sale sale) {
		this.sale = sale;
	}
}
