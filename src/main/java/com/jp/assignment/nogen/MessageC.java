package com.jp.assignment.nogen;

public class MessageC extends Message {
	private OperationType op;


	public void setOp(String op) {
		this.op = op;
	}

	@Override
	public MessageType getType() {
		return MessageType.UPD;
	}

	@Override
	public int getQuantity() {
		return 0;
	}

	@Override
	public OperationType getOp() {
		return this.op;
	}
}
