import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Boolean play = true;

        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to play craps? [y/n]");

        if (in.nextLine().equals("y"))
            do
        {

            int role_1 = rnd.nextInt(6) + 1;
            int role_2 = rnd.nextInt(6) + 1;
            int total = role_2 + role_1;

            if(total == 2 || total == 3 || total == 12)
            {
                System.out.println("You crapped out!");

                in = new Scanner(System.in);
                System.out.println("Would you like to play again? [y/n]");

                if(in.nextLine().equals("y"))
                    play = true;
                else
                    play = false;
            }
            else if(total == 7 || total == 11)
            {
                System.out.println("You rolled a natural! You win!");

                in = new Scanner(System.in);
                System.out.println("Would you like to play again? [y/n]");

                if(in.nextLine().equals("y"))
                    play = true;
                else
                    play = false;
            }
            else
            {
                System.out.println("You rolled a " + role_1 + " and a " + role_2 +
                        " your point is " + total);

                int point = total;
                boolean done = false;

                do
                {
                    in = new Scanner(System.in);
                    System.out.println("Enter 'r' to role again..");

                    if(in.nextLine().equals("r"))
                    {
                        role_1 = rnd.nextInt(6) + 1;
                        role_2 = rnd.nextInt(6) + 1;
                        total = role_2 + role_1;

                        if (total == point)
                        {
                            System.out.println("You rolled a " + role_1 + " and a " + role_2);
                            System.out.println("You got the point!");
                            done = true;

                            in = new Scanner(System.in);
                            System.out.println("Would you like to play again? [y/n]");

                            if(in.nextLine().equals("y"))
                                play = true;
                            else
                                play = false;
                        }
                        else if(total == 7)
                        {
                            System.out.println("You rolled a " + role_1 + " and a " + role_2);
                            System.out.println("You lost!");
                            done = true;

                            in = new Scanner(System.in);
                            System.out.println("Would you like to play again? [y/n]");

                            if(in.nextLine().equals("y"))
                                play = true;
                            else
                                play = false;

                        }
                        else
                        System.out.println("You rolled a " + role_1 + " and a " + role_2);
                    }
                }while(!done);
            }
        }while(play);

    }
}