package week11292021;

public class RockPaperScissors {
	public static String rps(String player1, String player2)
	{
		if(player1.toLowerCase().equals(player2.toLowerCase())&&(player1.toLowerCase().equals("rock")||player1.toLowerCase().equals("paper")||player1.toLowerCase().equals("scissors")))
		{
			return "TIE";
		}
		if(player1.toLowerCase().equals("rock") && player2.toLowerCase().equals("scissors") || player1.toLowerCase().equals("scissors") && player2.toLowerCase().equals("paper") || player1.toLowerCase().equals("paper") && player2.toLowerCase().equals("rock") )
		{
			return "Player 1 wins";
		}
		if(player2.toLowerCase().equals("rock") && player1.toLowerCase().equals("scissors") || player2.toLowerCase().equals("scissors") && player1.toLowerCase().equals("paper") || player2.toLowerCase().equals("paper") && player1.toLowerCase().equals("rock") )
		{
			return "Player 2 wins";
		}
		return "Invalid Inputs";
	}
}
