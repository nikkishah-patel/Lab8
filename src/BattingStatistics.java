import java.util.Arrays;
import java.util.Scanner;

public class BattingStatistics {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//calculate the batting average and slugging percentage for one or more baseball/softball players
	//first ask for the number of bats
	System.out.println("Number of at-bats?");
	
	int atBats = scan.nextInt();
	int [] basesEarned = new int[atBats];
	

	//for each bat, ask the user for the number of bases earned by the batter
	for (int i = 0; i < atBats; i++) {
		System.out.println("What is the number of bases earned by the batter?");
		basesEarned[i] = scan.nextInt();
		
	}
	
	System.out.println(Arrays.toString(basesEarned));
	
	//calculate batting avg
	double battingAvg = calcBattingAvg(basesEarned);
	
	//calculate slugging avg
	double sluggingAvg = calcSluggingAvg(basesEarned);
	
	//after all the at-bats are entered, display the batting average and slugging percentage of the batter
	System.out.println("Batting average: " + battingAvg);
	
	System.out.println("Sluggin percentage: " + sluggingAvg);
	
	//build an array to store the at-bat results for each player
	//validate the input so the user can only enter positive integers. for the at-bat results, the user can only enter 0,1,2,3,4
	//validate the users response to the question "Another batter?" so that the user can only enter Y,y,N, or N
	//if the user chooses N or n, end the program
	//format the batting avg and slugging percentages such that three decimal places are shown
	
	
}
		int atBats = scan.nextInt();
		int basesEarned = scan.nextInt();
		int numOfHits = scan.nextInt();
		
		

	public static double calcBattingAvg(int [] basesEarned) {
		
		for(int i=0; i < atBats.length; i++) {
			double avg = (numOfHits / atBats);
			return 0.0;
}
	}
	
		int atBats;
		int basesEarned;
		
	public static double calcSluggingAvg(int[] basesEarned) {
		
		for(int i=0; i < atBats.length; i++) {
			double percentage = ((double) basesEarned / (double )atBats);
			return 0.0;
	return 0.0;
}


}
