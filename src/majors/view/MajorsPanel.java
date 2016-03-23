package majors.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import majors.controller.MajorsController;

import javax.swing.*;

public class MajorsPanel extends JPanel
{
	private MajorsController baseController;
	private JButton majorsButton;
	private JButton yearButton;
	private JTextField textField;
	private SpringLayout textLayout;
	private JTextArea textArea;
	
	
	public MajorsPanel(MajorsController baseController)
	{
		this.baseController = baseController;
		textLayout = new SpringLayout();
		textArea = new JTextArea();
		textField = new JTextField();
		majorsButton = new JButton();
		yearButton = new JButton();
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setLayout(textLayout);
		this.add(textArea);
		this.add(majorsButton);
		this.add(yearButton);
		textField.setToolTipText("Type here for an answer");
		textArea.setEnabled(false);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		majorsButton.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent click)
			{
				String userText = textField.getText();
				String response = baseController.fromUserToModel(userText);
				textArea.append("\nUser: " + response);
				textArea.append("\nMajors: " + response);
				textField.setText("Submit");
			}	
		});
		
	}
	
	
}
