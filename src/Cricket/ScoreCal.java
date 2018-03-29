package Cricket;

public class ScoreCal 
{
	int i;
	public int calc(int runs)
	{
		int score = 0;
		for(i=0; i<6; i++)
		{
			score = score + runs;
		}
		
		return score;
	}
	
}
