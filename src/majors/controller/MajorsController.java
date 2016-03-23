package majors.controller;

import majors.model.MajorsModel;
import majors.view.MajorsDisplay;
import majors.view.MajorsFrame;


public class MajorsController 
{

	private MajorsModel myMajors;
	private MajorsDisplay myDisplay;
	private MajorsFrame majorsFrame;
	
	public MajorsController()
	{
		
		myDisplay = new MajorsDisplay();
		majorsFrame = new MajorsFrame(this);
		
	}
	
	public void start()
	{
		myDisplay.displayResponse("Hello " + myMajors.getUserName());
	}
	public String fromUserToModel(String userText)
	{
		String response = "";
		
		response = myMajors.processResponse(userText);
		
		return response;
	}
	
	public MajorsModel getMajorsModel()
	{
		return null;
	}
	
	public MajorsDisplay getMajorsDisplay()
	{
		return null;
	}
	
	public MajorsFrame getMajorsFrame()
	{
		return null;
	}
}
