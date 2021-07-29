package snakeladder;
import java.util.*;

public class SnakesLadders 
{
	static final int startPosition=0;	
	static final int winPoint=100;
	public static void main(String[] args) 
	{
		new SnakesLadders().play();
	}
	
	//method for rolling a dice
	public int rollDice()
	{
		Random r=new Random();
		int dRoll=r.nextInt(6)+1;
		System.out.println("Number that player got on dice: "+dRoll);
		return dRoll;
	}
	
	//method to check whether player got ladder,snake or no play
	public int option()
	{
		Random r=new Random();
		int o=r.nextInt(3);
		return o;		
	}
	
	//method for playing game
	public void play()
	{
		int playerPosition=startPosition;
		while(playerPosition<winPoint)
		{
			System.out.println(" ");
			int die=rollDice();
			int op=option();
			if(op==0)
			{
				System.out.println("---Player has no play---");
				System.out.println("Position: " +playerPosition);			
			}
			else if (op==1)
			{
				System.out.println("---Player got ladder---");
				playerPosition+=die;
				System.out.println("position: "+playerPosition);
			}
			else
			{
				System.out.println("---player got snake---");
				playerPosition-=die;
				
				if(playerPosition<0)
					playerPosition=0;
				System.out.println("position: "+playerPosition);
			}
		}
		
	}

}
