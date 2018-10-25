package com.jp.assignment.nogen;

public class MessageA extends Message {

	@Override
	public MessageType getType() {
		return MessageType.INS_ONE;
	}

	@Override
	public int getQuantity() {
		return 0;
	}

	@Override
	public OperationType getOp() {
		return null;
	}
	
}
