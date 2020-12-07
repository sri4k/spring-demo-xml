package org.demo.spring;

public class GolfCoach implements Coach{

	//field
	private InstructionService instructionService;
	
	//contructor for dependency injection
	public GolfCoach(InstructionService instructionService) {
		this.instructionService = instructionService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Golf Coach";
	}

	@Override
	public String getDailyInstruction() {
		return instructionService.getInstruction();
	}

	
}
