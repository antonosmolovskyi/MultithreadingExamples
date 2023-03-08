package multy_test;

public class Main {

	public static void main(String[] args) {
		
		GtaGame gta = new GtaGame();
		GtaLives first = new GtaLives(gta, "I'm first one");
		GtaLives second = new GtaLives(gta, "I'm second one");
		GtaLives third = new GtaLives(gta, "I'm third one");
	}

}
