package snakeladder;
import java.util.*;



public class SnakesLadders 
{
	static final int startPosition=0;
	
	public static void main(String[] args) 
	{
		
		new SnakesLadders().play();
	}
		
		
	public int rollDice()
	{
		Random r=new Random();
		int dRoll=r.nextInt(6)+1;
		System.out.println("Number that player got on dice: "+dRoll);
		return dRoll;
	}
	public int option()
	{
		Random r=new Random();
		int o=r.nextInt(3);
		return o;
		
	}
	public void play()
	{
		int playerPosition=startPosition;
		int die=rollDice();
		int op=option();
		if(op==0)
		{
			System.out.println("Player has no play, stays in same position");
			System.out.println("Position of player will be: " +playerPosition);
			
		}
		else if (op==1)
		{
			System.out.println("---Player got ladder---");
			playerPosition+=die;
			System.out.println("position of player after getting ladder: "+playerPosition);
		}
		else
		{
			System.out.println("---player got snake---");
			playerPosition-=die;
			if(playerPosition<0)
				playerPosition=0;
			System.out.println("position of player after getting snake: "+playerPosition);
		}
		//return playerPosition;
	}

}
