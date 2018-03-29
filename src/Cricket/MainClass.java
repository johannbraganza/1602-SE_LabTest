package Cricket;
import java.util.*;
public class MainClass 
{
	public static void main(String args[])
	{
		int overs;
		String team_A;
		String team_B;
		//int toss;
		
		System.out.println("Cricket Match ScoreCard App");
		
		Scanner input = new Scanner(System.in);
		
		//Team A
		System.out.println("Enter the first team");
		team_A = input.next();
		System.out.println("Team_A: "+team_A);
		
		//Team B
		System.out.println("Enter the Second team");
		team_B = input.next();
		System.out.println("Team_B: "+team_B);
	
		
		//Overs of the match
		System.out.println("Enter the number of overs: ");
		overs = input.nextInt();
		System.out.println("Number of overs: "+overs);
		
		matchInfo match = new matchInfo(team_A, team_B, overs);
		System.out.println("Now the Game begins");
	}
}
