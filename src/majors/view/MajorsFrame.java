package majors.view;

import javax.swing.JFrame;
import majors.controller.MajorsController;
import majors.view.MajorsPanel;

public class MajorsFrame extends JFrame
{

	private MajorsController baseController;
	private MajorsPanel basePanel;
	
	public MajorsFrame(MajorsController baseController)
	{
		this.baseController = baseController;
		basePanel = new MajorsPanel(baseController);
		
		setupFrame();
	}
	

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setTitle("Majors");
		this.setSize(400,400);
		this.setVisible(true);
	}
	




	public MajorsController getBaseController()
	{
		return baseController;
	}
}
