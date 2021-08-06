// This class created for Assignment03 by YasarERKAN
public class Assignment03YasarERKAN {
	
	// This is a main method 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
				// Defining and initializing variables named roll and totalRolls
				int roll = 0;
				int totalRolls = 0;
				//An array definition that can hold 20 values of int type is being made here
				int[] diceRolls = new int[20];
				

				// Roll values are creating by math.random method  and for loop.
				//Also they are assigning to array  was named diceRolls 
				for(int count = 0; count < 1000; count++) {
				    roll = (int)(Math.random() * 19) + 1;
				    diceRolls[roll] = diceRolls[roll - 1] + 1; // crashes
				}	
				// This for loop creating  report for all array values.
				//Also  it calculates totalRolls value
				for(int index = 0; index < diceRolls.length; index++) {
				    System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
				    totalRolls = totalRolls + diceRolls[index];
				}
				// These codes print to screen  total rolls and programmer name
				System.out.println("Total rolls were: " + totalRolls);
				System.out.println("Program by Yasar ERKAN");


	}

}
