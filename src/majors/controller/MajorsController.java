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
		String user = myDisplay.getUserInput("Enter your name!");
		myMajors = new MajorsModel(user);
		majorsFrame = new MajorsFrame(this);
		
	}
	
	public void start()
	{
		myDisplay.displayResponse("Hello " + myMajors.getUserName());
	}
	
	private void 
	{
		String textFromUser - myDisplay.getUserInput("");
		while(myMajors.lengthChecker(textFromUser))
		{
			textFromUser = myMajors.processQuestion(textFromUser);
			textFromUser = myDisplay.getUserInput(textFromUser);
		}
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
