package Cricket;

public class matchInfo 
{
	//input taken from from the mainclass
	public String team_A, team_B;
	
	//initialize both variables to null
	public int match_overs = 0;
	public int current_over = 0;
	
	public Over[] overs;
	
	public matchInfo(String team_A, String team_B, int no_overs)
	{
		this.team_A = team_A;
		this.team_B = team_B;
		this.match_overs = no_overs;
		
		match_overs = no_overs;
		overs = new Over[match_overs];
		
		for(int i=0; i<match_overs; i++)
		{
			overs[i]=new Over();
		}
	}
	
	public int scoreSheet(int score)
	{
		int ss=0; //score_sheet
		
		if(current_over<match_overs)
		{
			overs[current_over].scoreSheet(score);
			current_over++;
			ss=score;
		}
		return ss;
	}
	
	public int getCurrentOver() {
		return current_over;
	}

	public Over getOverAt(int i) 
	{
		return overs[i];
	}
}
