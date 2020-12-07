package org.demo.spring;

public class BaseballInstruction implements InstructionService {

	@Override
	public String getInstruction() {
		return "Hit the base ball";
	}

}
