package org.demo.spring;

public class CricketInstruction implements InstructionService {

	@Override
	public String getInstruction() {
		return "Hit a six";
	}

}
