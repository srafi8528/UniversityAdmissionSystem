package org.jsp.app.model.logics;

import java.util.Random;

public class GenerateRollNumber 
{
	public static int generateRollNumber()
	{
		Random random = new Random();
		int rollNumber = random.nextInt(10000000);
		if(rollNumber < 1)
		{
			rollNumber = rollNumber*-1;
			return rollNumber;
		}
		else
		{
			return rollNumber;
		}
	}
}
