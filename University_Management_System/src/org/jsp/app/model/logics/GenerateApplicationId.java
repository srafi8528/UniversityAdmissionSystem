package org.jsp.app.model.logics;

import java.util.Random;

public class GenerateApplicationId 
{
	public static int generateApplicationId()
	{
		Random random = new Random();
		int applicationId = random.nextInt(10000000);
		if(applicationId < 1)
		{
			applicationId = applicationId*-1;
			return applicationId;
		}
		else
		{
			return applicationId;
		}
	}
}
