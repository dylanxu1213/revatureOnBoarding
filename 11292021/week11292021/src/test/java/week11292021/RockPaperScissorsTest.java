package week11292021;

import static org.junit.Assert.*;

import org.junit.Test;

public class RockPaperScissorsTest {

	@Test
	public void test() {
		String rps1 = RockPaperScissors.rps("rock", "paper");
		assertEquals("Player 2 wins",rps1);
		String rps2 = RockPaperScissors.rps("paper", "rock");
		assertEquals("Player 1 wins",rps2);
		String rps3 = RockPaperScissors.rps("paper", "scissors");
		assertEquals("Player 2 wins",rps3);
		String rps4 = RockPaperScissors.rps("scissors", "scissors");
		assertEquals("TIE",rps4);
		String rps5 = RockPaperScissors.rps("scissors", "paper");
		assertEquals("Player 1 wins",rps5);
	}

}
