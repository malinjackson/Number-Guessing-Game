import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {

            Scanner scnr = new Scanner(System.in);
            int attempt = 1;
            int solutionNum = (int) (Math.random() * 99+1);
            int guess = 0;
        System.out.println("Guess the number between 1 and 100! You have 10 attempts!");

            do{
                System.out.println("Guess a number:");
                if(scnr.hasNextInt()) {
                    guess =scnr.nextInt();
                    if (guess == solutionNum) {
                        System.out.println("Congratulations! You got it!");
                        break;

                    } else if (guess < solutionNum) {
                        System.out.println("The number is higher than "+guess);

                    } else if(guess>solutionNum) {
                        System.out.println("The number is lower than " + guess);

                    } if(attempt==10){
                        System.out.println("You're out of attempts! The number was: "+ solutionNum);
                        break;
                    }
                    attempt++;
                }else {
                    System.out.println("Please enter a valid number!");
                    break;
                }

            } while(guess!=solutionNum);
        }

}
