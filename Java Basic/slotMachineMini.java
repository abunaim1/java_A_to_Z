import java.util.Random;
import java.util.Scanner;

public class slotMachineMini {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        System.out.println("***********************");
        System.out.println(" Welcome to Java Slot ");
        System.out.println("🍒   🍉   🍋    🔔   ⭐️");
        System.out.println("***********************");

        while(balance > 0){
            System.out.println("Current Balance: $" + balance);
            System.out.println("Place your bet");
            bet = scanner.nextInt();
            scanner.nextLine();
            if(bet > balance){
                System.out.println("INSUFFICIENT BALANCED");
                continue;
            }
            else if(bet <= 0 ){
                System.out.println("Bet must be grater than 0");
            }
            else
            {
                balance -= bet;
            }
            System.out.println("Spining...");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            if(payout > 0){
                System.out.println("You WIN $" + payout);
                balance += balance+payout;
            }
            else{
                System.out.println("YOU LOST! GOOD LUCK for Next Round");
                balance -= payout;
            }
            System.out.println("DO you want to play again(Y/N)");
            playAgain = scanner.nextLine().toUpperCase();
            if (!playAgain.equals("Y")) {
                break;
            }
            
            System.out.println("GAME OVER! Your Final balance is $" + balance);
        }
        scanner.close();
    }
    static String[] spinRow(){
        String[] symbol = {"🍒",   "🍉",   "🍋",    "🔔",   "⭐️"};
        String row[] = new String[3];
        Random random = new Random();

        for(int i=0; i<3; i++){
            row[i] = symbol[random.nextInt(symbol.length)];
        }

        return row;
    }
    
    static void printRow(String[] row){
        System.out.println("*****************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("*****************");
    }
    static int getPayout(String[] row, int bet){
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                    case "🍒" -> bet * 2;
                    case"🍉" -> bet * 3;
                    case "🍋" -> bet * 4;
                    case "🔔" -> bet * 5;
                    case "⭐️" -> bet * 6;
                    default -> 0;
            };
        }
        return 1;
    }
}