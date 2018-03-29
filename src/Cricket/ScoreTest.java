package Cricket;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScoreTest {

	matchInfo First_Innings;
	Scores score;
	@Test
	public void test() {
		First_Innings = new matchInfo("Punjab", "Delhi", 4);
		score = new Scores(First_Innings);
		score.scoreSheet(1);
		score.scoreSheet(2);
		assertEquals(3,score.getCurrentScore());
	}

}
