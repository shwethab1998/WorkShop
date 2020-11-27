import java.util.Random;
public class SnakesLadder
{
        public static int PLAYER_POS=0; //UC1, initializing player position as 0
	public static int die_roll,player=PLAYER_POS,dieCounter=0;
        public void rolldice()
        {
                Random random=new Random();
                die_roll=random.nextInt(6)+1;
		System.out.println(die_roll);
	}
	public void Option()
	{
		Random option_random=new Random();
                int option=option_random.nextInt(3);
		switch(option)
		{
                case 1:
			player+=die_roll;
			if(player>100)
			{
			player-=die_roll;
			}
                        System.out.println("You got Ladder!!:");
                break;
		case 0:
			player-=die_roll;
			if(player<0)
			{
                        player=PLAYER_POS;
	             	}
			System.out.println("You got Snake!!: ");
		break;
                default:
			System.out.println("No Play!!: ");
		break;
		}
		dieCounter++;
        }
        public static void main(String[] args)
        {
                SnakesLadder user=new SnakesLadder();
                while(player<100)
		{
			user.rolldice();
			user.Option();
                }
		System.out.println("Die was thrown "+dieCounter+" times");
                System.out.println("Player won!!, Position is:"+player);
        }
}





























