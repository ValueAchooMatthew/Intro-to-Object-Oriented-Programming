/* Assignment 7 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (40 marks)
    Use java to implement a class Dice, a class Gambler and a method that continue gambling between two gamblers until one
    gambler cannot afford the stake.

 */

// the class of Dice to play
class Dice {
    private int num_faces;

    Dice(){
        num_faces=6; // standard dice with 6 faces by default.
    }

    // implement the roll dice method that roll the dice once and return the value of the roll.
    // (5 marks)
    public int rollDice() {
        /* place your code here */
        return (int)Math.floor(Math.random()*7);
    }
}

// the class of gambler
class Gambler {
    public int money;
    public Dice die;

    Gambler(int initial_money) {
        money = initial_money;
        die = new Dice();
    }

    // use static method to implement the gambling activity.
    // In a gambling activity, two gamblers gamble on a stake.
    // Each gambler rolls a die, the gambler who roles a larger value wins the stake.
    // if it is a due, then roll again, until there is a winner.
    // Note: a gambler cannot start gamble if he does not have more money than the amount of stake.
    // Note: return false if at least one gambler cannot afford the stake. Otherwise, return true.
    // Note: print the result of rolled dice values, and the winner of the gambling.
    // (20 marks)
    static boolean gambling(Gambler gambler_1, Gambler gambler_2, int stake) {
        /* place your code here */
        if(gambler_1.money >= stake && gambler_2.money >= stake){
            boolean done = false;
            while(!done){
                done = true;
                gambler_1.money -= stake;
                gambler_2.money -= stake;
                int pot = 2*stake;
                int roll_1 = gambler_1.die.rollDice();
                int roll_2 = gambler_2.die.rollDice();
                System.out.println("Gambler 1 rolled a " +roll_1 +".");
                System.out.println("Gambler 2 rolled a " +roll_2 +".");
                if(roll_1 > roll_2){
                    gambler_1.money += pot;
                } else if (roll_2 > roll_1) {
                    gambler_2.money += pot;
                }else{
                    done = false;
                }
            }
            return true;
        }else{
            return false;
        }


    }
}

public class Q1_DiceGambling {

    // Continue Gambling until one gambler cannot afford the stake
    // Print the amount of money of each gambler after each round of gambling.
    // Print the value of rolled dice for each gambler in each round of gambling.
    // (15 marks)
    public static void keepGambling(Gambler gambler_1, Gambler gambler_2, int stake, int max_gambling_times) {
        /* place your code here */
        int i = 1;
        while((i < max_gambling_times) && (gambler_1.money >= stake) && (gambler_2.money >= stake)){
            i++;
            Gambler.gambling(gambler_1, gambler_2, stake);
            System.out.println("Gambler 1 has $" + gambler_1.money);
            System.out.println("Gambler 2 has $" + gambler_2.money);
        }
    }

    public static void main(String[] args) {
        int initial_money = 10;
        int stake = 5;
        int max_gambling_times = 10;

        Gambler gambler1 = new Gambler(initial_money);
        Gambler gambler2 = new Gambler(initial_money);

        keepGambling(gambler1, gambler2, stake, max_gambling_times);

    }
}
