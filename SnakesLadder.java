import java.util.Random;
public class SnakesLadder
{
        public int PLAYER_POS=0,player=PLAYER_POS,die_roll;   //UC1, initializing player position
        public void rolldice()
        {
                Random random=new Random();
                die_roll=random.nextInt(6)+1;
                System.out.println("Number Rolled is:"+die_roll);
	}
	public void Option()
	{
		Random option_random=new Random();
                int option=option_random.nextInt(3);
		switch(option)
		{
                case 1:
                        System.out.println("You got Ladder, Mover Forward!!");
                        player+=+die_roll;
                break;
		case 0:
                System.out.println("You got Snake :(");
			if(player==0)
			{
                        player=PLAYER_POS;
                	}
			else
			player=-die_roll;
		break;
                default:
                        System.out.println("No Play!!");
                        player=player;
                break;
		}
                System.out.println("Player's Postition is:"+player);
        }
        public static void main(String[] args)
        {
                SnakesLadder user=new SnakesLadder();
                user.rolldice();   //UC2, dice roll b/w 1-6
		user.Option();     //UC3, dice output options
        }
}
































