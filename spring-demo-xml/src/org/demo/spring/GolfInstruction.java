package org.demo.spring;

public class GolfInstruction implements InstructionService {

	@Override
	public String getInstruction() {
		return "Hit the golf ball";
	}

}
