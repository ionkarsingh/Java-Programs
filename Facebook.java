public class Facebook
{
	public static void main(String[] args)
	{
		FBServer fbs = new FBServer();
		FBPostAlert fbpa = new FBPostAlert();
		FBFriendAlert fbfa = new FBFriendAlert();
		FBBirthdayAlert fbba = new FBBirthdayAlert();

		fbs.sendAlert(fbpa);
		fbs.sendAlert(fbfa);
		fbs.sendAlert(fbba);
	}
}

class FBServer
{
	public void sendAlert(FBAlert fba)
	{
		FBClient fbc = new FBClient();
		fbc.receiveAlert(fba);
	}
}

class FBClient
{
	public void receiveAlert(FBAlert fba)
	{
		fba.showCompany();
		fba.showAlertDetails();
		if(fba.alertType.equals("Post"))
		{
			FBPostAlert f1;
			f1 = (FBPostAlert) fba;
			f1.showPostDetails();
		}
		else if(fba.alertType.equals("Friend"))
		{
			FBFriendAlert f2;
			f2 = (FBFriendAlert) fba;
			f2.showFriendDetails();
		}
		else if(fba.alertType.equals("Birthday"))
		{
			FBBirthdayAlert f3;
			f3 = (FBBirthdayAlert) fba;
			f3.showBirthdayDetails();
		}
	}
}

abstract class FBAlert
{
	String alertType; //for Downcasting
	
	public void showCompany()
	{
		System.out.println("Facebook");
	}

	abstract public void showAlertDetails();
}

class FBBirthdayAlert extends FBAlert
{
	public FBBirthdayAlert()
	{		
		alertType = "Birthday";
	}

	public void showAlertDetails()
	{
		System.out.println("This is Birthday alert details.");
	}

	public void showBirthdayDetails()
	{
		System.out.println("These are Birthday details");
	}
}

class FBFriendAlert extends FBAlert
{
	public FBFriendAlert()
	{		
		alertType = "Friend";
	}

	public void showAlertDetails()
	{
		System.out.println("This is friend alert details.");
	}

	public void showFriendDetails()
	{
		System.out.println("These are friend's details");
	}
}

class FBPostAlert extends FBAlert
{
	public FBPostAlert()
	{		
		alertType = "Post";
	}

	public void showAlertDetails()
	{
		System.out.println("This is post alert details.");
	}

	public void showPostDetails()
	{
		System.out.println("These are post details");
	}
}