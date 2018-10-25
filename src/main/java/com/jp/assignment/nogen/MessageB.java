package com.jp.assignment.nogen;

public class MessageB extends Message {
	private int q;

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
	}

	@Override
	public MessageType getType() {
		return MessageType.INS_N;
	}

	@Override
	public int getQuantity() {
		return this.q;
	}

	@Override
	public OperationType getOp() {
		return null;
	}
}
