//Task 1

import java.util.*;
// This is the game of guessing number
class random_generator {
    static final int MAX_ATTEMPTS = 5;// limit of attenmpts
    public static void main(String[] args) {

        System.out.println("Number Game"); // game name

        Scanner sc = new Scanner(System.in);

        Random random = new Random();

        int attempts= MAX_ATTEMPTS; // assigning the maxattempts into attempts variable
        int rounds = 0;

        boolean game = true;

        int score = 0;

        System.out.println("Enter your name");

        String username = sc.nextLine();
        // logic for game
        while (game == true) {

            int guessnumber = random.nextInt(0, 100);// number to be guessed
            int userattempts = 0;
            boolean won = false;

            rounds = rounds + 1;

            attempts = MAX_ATTEMPTS;
            while (attempts > 0) {

                System.out.println("Choose a number");

                int user = sc.nextInt();

                if (user > guessnumber) {
                    if (user - guessnumber > 10) {

                        System.out.println("too high");

                    } else {

                        System.out.println("high");

                    }
                } else if (user < guessnumber) {

                    if (guessnumber - user > 10) {

                        System.out.println("too low");

                    } else {

                        System.out.println("low");

                    }
                } else {

                    userattempts++;

                    System.out.println("Congratulations: you guess the correct number i.e. " + guessnumber);

                    System.out.println("You  guessed the number in " + userattempts + " attempts");

                    score += MAX_ATTEMPTS - userattempts + 1;

                    won = true;
                    break;

                }
                attempts--;
                userattempts++;
            }
            if (won == false) {

                System.out.println("Attempts left = " + attempts);

                System.out.println("You lose");

                score += 0;

                System.out.println("The number you want to guess was " + guessnumber);
            }

            System.out.println(" Do you want to play another round? (yes/no):");

            String checkanswer = sc.next();

            if (checkanswer.equalsIgnoreCase("yes")) {

                continue;

            } else {

                break;

            }
        }

        System.out.println(username + " has scored " + score + " in total " + rounds + " rounds"); //Result declared of the user
    }
}