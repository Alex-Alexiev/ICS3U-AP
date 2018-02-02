package ca.bayviewglen.refactoredCrossCountry;

public class Race {
	
	private Runner[] runners;
	
	public Race(int numRunners) {
		runners = new Runner[numRunners];	
		for (int i = 0; i < numRunners; i++) {
			runners[i] = new Runner();
		}
	}
		
	public void printRaceSummary() {  
		if (runners.length > 0) {
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n");
			System.out.printf("%-30s%20s%20s%20s%20s\n", "Runner Name", "Split One Time", "Split Two Time", "Split Three Time", "Total Time");
			for (int i = 0; i < runners.length; i++) {
				System.out.printf("%-30s%20s%20s%20s%20s\n", runners[i].getLastName() + "," + runners[i].getFirstName(), runners[i].getSplitOne(), runners[i].getSplitTwo(),
						runners[i].getSplitThree(), runners[i].getFiveKmTime());
			}
		} 
		else {
			System.out.println("There are no runners in the race!");
		}
	}
	


}
