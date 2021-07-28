package snakeladder;
import java.util.*;

public class SnakesLadders 
{
	static final int startPosition=0;
	
	public static void main(String[] args) 
	{
		int playerPosition=startPosition;
		Random r=new Random();
		int rollDice=r.nextInt(6)+1;
		System.out.println("The starting position of player is: "+playerPosition);
		System.out.println("Number that player got on dice is: " +rollDice);
	}

}
