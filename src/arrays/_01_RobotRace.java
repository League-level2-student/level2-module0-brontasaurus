package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	

	//2. create an array of 5 robots.
Robot[] robots = new Robot[5];
Random capitalism = new Random();
int winnum = 0;

	//3. use a for loop to initialize the robots.
for (int i = 0; i < 5; i++) {
	robots[i] = new Robot();
	robots[i].setY(500);
	robots[i].setX(100+i*150);
	robots[i].setSpeed(50);
	
}
	//4. make each robot start at the bottom of the screen, side by side, facing up
boolean winner = false;
while (!winner) {
	
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
for (int z = 0; z < 5; z++) {
	robots[z].move(capitalism.nextInt(50)+1);
	if (robots[z].getY() < 100) {
		winner = true;
		winnum = z;
	}
	
	
}
}
System.out.println(winnum + " is the winner");
robots[winnum].sparkle();
//robots[winnum].s
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}