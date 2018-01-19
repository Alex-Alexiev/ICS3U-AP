package ca.bayviewglen.dayone;

public class DieDriver {

	public static void main(String[] args) {
		
		Die playerOne = new Die();
		Die playerTwo = new Die();
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < 100; i++) {
			if (playerOne.getTopSide()>playerTwo.getTopSide()) {
				count1++;
			}
			else if (playerTwo.getTopSide()>playerOne.getTopSide()) {
				count2++;
			}
			playerOne.roll();
			playerTwo.roll();
		}
		
		System.out.println("Player One Score: "+count1);
		System.out.println("Player Two Score: "+count2);
		
	}

}
