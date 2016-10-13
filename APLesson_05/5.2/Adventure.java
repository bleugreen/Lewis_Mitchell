import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Adventure{
	public static void main(String [] args){
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to Space Adventure\nChoices are made by choosing the number of the choice\nFor example to choose \"1) Go outside\" you would enter: 1");
		System.out.println("Press enter to begin");
		kb.nextLine();
		
		System.out.println("You are the captain of an early expedition to Neptune, your ship is in critical condition after an unexpected meteor storm\nYou are almost out of fuel, but within range of a crash landing on Mars.\nDo you 1) Prepare landing on Mars or 2) Try to conserve fuel to reach the base above Venus?");
		int choice1 = kb.nextInt();
		if(choice1==1){
			System.out.println("You adjust your trajectory with the little fuel remaining and begin your descent to Mars\nDue to a lack of fuel, you cannot slow the ship and you are forced to eject from the ship 100m from the surface.\n");
			try {
				Thread.sleep(2000);
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			System.out.println("...");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			
			System.out.println("You wake up in the battered command pod\nThe meteors damaged the parachutes, and they failed to open properly\nAs you look around, you realize that none of your crew survived the crash...\nDo you 1) Stay in the safety of the pod and call for help or 2) Explore the wreckage of the ship?");
			int choice2 = kb.nextInt();
			if(choice2==1){
				System.out.println("As night falls, temperatures drop to -125 degrees\nThe command pod is equipped with heaters, but unfortunately power was lost in the crash\nAs you succumb to the cold, you finally learn the true cost of adventure\nGAME OVER Please try again");
			}
			else if(choice2==2){
				System.out.println("You don the proective suit and exit the pod\nYou survey your surroundings, taking in the Martian landscape\nBut the setting sun brings you to your senses\nYou make your way to the ship, and begin collecting materials\nAfter a few minutes, you have gathered supplies for fire, shelter, and possibly a means of communication");
				try {
					Thread.sleep(2000);
				} catch(InterruptedException ex) {
					Thread.currentThread().interrupt();
				}
				System.out.println("The materials are heavy, and you realize you only have the strength to bring one with you to the pod\n Do you bring 1) Fire, 2) Shelter, or 3)Communication?");
				int choice3 = kb.nextInt();
				if(choice3==1){
					System.out.println("You carry the fire supplies back to the pod as the temperature begins to drop\nYou manage to start a meager fire in the pod and it keeps you warm through the night\nHowever, you forgot to ventilate the pod, and the smoke suffocates you in your sleep");
					System.out.println("GAME OVER Please try again");
				}
				else if(choice3==2){
					System.out.println("You carry your shelter supplies back to your shelter before realizing that you now have two shelters and apparently a death wish\nTemperatures drop to -125 degrees overnight and you freeze");
					System.out.println("GAME OVER Please try again");
				}
				else if(choice3==3){
					System.out.println("You bring the communication supplies back to the pod, and manage to put together a distress signal\nThe signal reaches Earth just in time for you to freeze in the -125 degree night");
					System.out.println("GAME OVER Please try again");
				}
				else{
					System.out.println("You have entered an invalid input, Please try again");
				}
			}
			else{
				System.out.println("You have entered an invalid input, Please try again");
			}
		}
		else if(choice1==2){
			System.out.println("Your crew is outraged by the decision\nYou run out of fuel before reaching Neptune's atmosphere\nThe ship is headed on a crash course towards Jupiter, but the lack or rations gets to you much faster\nGAME OVER Please try again");
		}
		else{
			System.out.println("You have entered an invalid input, Please try again");
		}
	}
	
	
}