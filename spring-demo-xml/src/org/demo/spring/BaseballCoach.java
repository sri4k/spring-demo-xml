package org.demo.spring;

public class BaseballCoach implements Coach{

	//field
	private InstructionService instructionService;
	
	//contructor for dependency injection
	public BaseballCoach(InstructionService instructionService) {
		this.instructionService = instructionService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Baseball Coach";
	}

	@Override
	public String getDailyInstruction() {
		return instructionService.getInstruction();
	}
}
