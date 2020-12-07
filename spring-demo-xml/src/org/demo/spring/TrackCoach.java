package org.demo.spring;

public class TrackCoach implements Coach {

	//field
	private InstructionService instructionService;
	
	//contructor for dependency injection
	public TrackCoach(InstructionService instructionService) {
		this.instructionService = instructionService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Track Coach";
	}

	@Override
	public String getDailyInstruction() {
		return instructionService.getInstruction();
	}

	//add an init method
	public void initBean() {
		System.out.println("Inside TrackCoach init");
	}
	
	//add a destroy method
	public void destroyBean() {
		System.out.println("Inside TrackCoach destroy");
	}
}
