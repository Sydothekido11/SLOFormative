package majors.model;

import java.util.ArrayList;

public class MajorsModel 
{

	private ArrayList<String> majorsList;
	private ArrayList<String> yearList;
	private String userName;
	private String content;
	
	public MajorsModel(String userName)
	{
		this.majorsList = new ArrayList<String>();
		this.yearList = new ArrayList<String>();
		this.userName = userName;
		this.content = "";
		
		buildMajorsList();
		buildYearList();
	}
	
	private void buildMajorsList()
	{
		this.majorsList.add("Anthropology");
		this.majorsList.add("Biology");
		this.majorsList.add("Computer Science");
		this.majorsList.add("Design");
	}
	
	private void buildYearList()
	{
		this.yearList.add("1");
		this.yearList.add("2");
		this.yearList.add("3");
		this.yearList.add("4");
	}
	
	public boolean majorsListChecker(String currentInput)
	{
		boolean hasMajors = false;
		
		for(String majors : majorsList)
		{
			if(currentInput.toLowerCase().contains(majors.toLowerCase()));
			{
				hasMajors = true;
			}
		}
		
		return hasMajors;
	}
	
	public boolean yearListChecker(String currentInput)
	{
		boolean hasYear = false;
		
		for(String year : yearList)
		{
			if(currentInput.toLowerCase().contains(year.toLowerCase()));
			{
				hasYear = true;
			}
		}
		
		return hasYear;
	}
	
	
	public String processResponse(int currentInput)
	{
		if(currentInput == 1)
		{
			return "Freshmen";
		}
		else
		{
			return null;
		}
	}
	public String getUserName() 
	{

		return null;
	}

	public String processResponse(String userText) 
	{
		return null;
	}
	

	
	
}
