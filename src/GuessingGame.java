import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        int answer=18;
        int turns=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Guess a number between 1 to 100, You will have 10 turns!" );

        int guess;
        int upperbound = 100;
        int lowerbound = 0;

        int i=0;
        boolean win=false;
        while(win==false) {
            guess=scan.nextInt();
            turns++;

            if(guess==answer) {
                win=true;
            }
            else if(i>8){
                System.out.println("You loose! the right answer was: "+answer);
                continue;
            }
            else if(guess>= upperbound || guess <= lowerbound){
                System.out.println("You guess of " + guess + " is out the range.");
                System.out.println("Guess a number between " + lowerbound + " to " + upperbound + ".");
                continue;
            }
            else if(guess<answer){
                i++;
                lowerbound = guess;
                System.out.println("Yor guess is lower than the right guess! Turns left: "+(10-i));
                System.out.println("Guess a number between " + lowerbound + " to " + upperbound + ".");
            }
            else if(guess>answer) {
                i++;
                upperbound = guess;
                System.out.println("Your guess is higher than e right guess! Turns left: "+(10-i));
                System.out.println("Guess a number between " + lowerbound + " to " + upperbound + ".");
            }
        }
        System.out.println("You win!");
        System.out.println("The number was "+answer);
        System.out.println("You used "+turns+" turns to guess the right number");
        System.out.println("Your score is "+((11-turns))+" out of 10");
        System.out.println("I love you <3");
    }
}