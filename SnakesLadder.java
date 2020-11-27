import java.util.Random;
public class SnakesLadder
{
        public int PLAYER_POS=0; //UC1, initializing player position as 0
	public int die_roll,player=PLAYER_POS;
        public void rolldice()
        {
                Random random=new Random();
                die_roll=random.nextInt(6)+1;
	}
	public void Option()
	{
		while(player<=100)
                {
		rolldice();
		Random option_random=new Random();
                int option=option_random.nextInt(3);
		switch(option)
		{
                case 1:
			player+=die_roll;
                        System.out.println("You got Ladder!!");
                break;
		case 0:
			if(player<0)
			{
                        player=PLAYER_POS;
                	}
			else{
			player=-die_roll;
			}
			System.out.println("You got Snake!!");
		break;
                default:
                        player=player;
			System.out.println("No Play!!");
		break;
		}
		}
		System.out.println("Player Won, Position is now:"+player);
        }
        public static void main(String[] args)
        {
                SnakesLadder user=new SnakesLadder();
                user.rolldice();   //UC2, dice roll b/w 1-6
		user.Option();     //UC3, dice output options
        }
}
































