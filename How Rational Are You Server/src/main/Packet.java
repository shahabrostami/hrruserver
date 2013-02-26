package main;

public class Packet {
	public static class Packet00SyncMessage { public int sessionID; public int player; }
	public static class Packet0CreateRequest{ public String player1Name; public String password; }
	public static class Packet1CreateAnswer{ public boolean accepted = false; public int sessionID; public String password; }
	public static class Packet2JoinRequest{ public String player2Name; public int sessionID; public String password; }
	public static class Packet3JoinAnswer{ public String player1Name; public boolean accepted = false; public int sessionID; public String password; }
	public static class Packet4ConnectionEstablished { public String player2Name; }
	public static class Packet5CancelRequest { public int sessionID; }
	public static class Packet6CancelRequestResponse { public String message; }
	public static class Packet7Ready { public int sessionID; public int player; }
	public static class Packet8Start { public int sessionID; int[] board; }
	public static class Packet9CharacterSelect { public int sessionID;  public int player; public int characterID; }
	public static class Packet10ChatMessage { public int playerID; public String message; }
	public static class Packet11TurnMessage { public int sessionID; public int playerID; public int moves; public int tile; }
	public static class Packet12PlayReady { public int sessionID; public int player; }
	public static class Packet13Play { public int activity; public int activity_id; public int secondary_id; public int secondary_value; }
	public static class Packet14QuestionComplete { public int sessionID; public int player; public int points; public int difficulty; public int elapsedtime; public int overall; public boolean correct; }
	public static class Packet15PuzzleComplete { public int sessionID; public int player; public int points; public int difficulty; public int elapsedtime; public int overall; public boolean correct; }
	public static class Packet16SendBid { public int sessionID; public int player; public int bid; public int itemValue; }
	public static class Packet17EndBid { public int itemValue; public int otherPlayerBid; public int playerWon; public int amountWon; public boolean win;}
}