package org.demo.spring;

public class CricketCoach implements Coach {

	private InstructionService instructionService;
	
	private String email;
	private String team;
	
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach no-arg constructor");
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("inside setter email");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("inside setter team");
		this.team = team;
	}

	//create a setter
	public void setInstructionService(InstructionService instructionService) {
		this.instructionService = instructionService;
		System.out.println("inside setter instructionService");
	}

	@Override
	public String getDailyWorkout() {
		return "Cricket Coach";
	}

	@Override
	public String getDailyInstruction() {
		return instructionService.getInstruction();
	}

}
