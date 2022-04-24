import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {
            //Sets the starting number of attempts, the user's input as the guess, and the computer's random solution number.
            Scanner scnr = new Scanner(System.in);
            int attempt = 1;
            int solutionNum = (int) (Math.random() * 99+1);
            int guess = 0;
        System.out.println("Guess the number between 1 and 100! You have 10 attempts!");
            
        //A do-while loop that takes the user's guess, compares it to the solution number, and updates the guess to the next inputted integer if it does not match the solution number.
            do{
                System.out.println("Guess a number:");
                if(scnr.hasNextInt()) {
                    guess =scnr.nextInt();
                    
                    //Compares the user's guess to the solution number and tells them if their guess was too high, too low, or spot on.
                    if (guess == solutionNum) {
                        System.out.println("Congratulations! You got it!");
                        break;

                    } else if (guess < solutionNum) {
                        System.out.println("The number is higher than "+guess);

                    } else if(guess>solutionNum) {
                        System.out.println("The number is lower than " + guess);

                    } 
                    //Checks to see if the user is still within the allowed number of attempts and increments accordingly.
                    if(attempt==10){
                        System.out.println("You're out of attempts! The number was: "+ solutionNum);
                        break;
                    }
                    attempt++;
                }else {
                    //Checks to see if a valid number or character was inputted.
                    System.out.println("Please enter a valid number!");
                    break;
                }

            } while(guess!=solutionNum);
        }

}
