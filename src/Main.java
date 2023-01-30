import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Object[] gaming = new Object[9];
        Player[] players = new Player[2];
        int round = 0;
        int process = 1;
        int result = 0;
        int number = 0;
        System.out.println("Enter first player name");
        String name = scanner.nextLine();
        Random random = new Random();
        int i = random.nextInt(2) + 1;
        int indicator1 = i;
        Player player1 = new Player(name, indicator1);
        System.out.println("Enter second player name");
        name = scanner.nextLine();
        int indicator2;
        if (indicator1 == 1) {
            indicator2 = 2;
        } else {
            indicator2 = 1;
        }
        Player player2 = new Player(name, indicator2);
        if (player1.indicator == 1) {
            players[0] = player1;
            players[1] = player2;
        } else {
            players[0] = player2;
            players[1] = player1;
        }
        System.out.println("Hello, " + player1.name);
        System.out.println("Hello, " + player2.name);


        if (player1.indicator == 1) {
            System.out.println(player1.name + ", you can begin\nYou play X");
        } else if (player1.indicator == 2) {
            System.out.println(player2.name + ", you can begin\nYou play X");
        }
        Arena arena = new Arena();
        arena.createArena(gaming);
        arena.showArena(gaming);

        while (round < 9) {
            if (process % 2 == 0) {
                System.out.println(players[1].name + "'s turn. O");
            }
            else{
                System.out.println(players[0].name + "'s turn. X");
            }
            number = Integer.parseInt(scanner.nextLine());
            while (number > 9 || number < 1) {
                System.out.println("Incorrect input! Try again");
                number = Integer.parseInt(scanner.nextLine());
            }
            while (gaming[number - 1] != " ") {
                System.out.println("This place is not empty! Try again");
                number = Integer.parseInt(scanner.nextLine());
            }

            arena.correct_Turn(gaming, number, process);
            process = process + 1;
            arena.showArena(gaming);
            if ((round > 3) || (round == 3)) {
                if (arena.result(gaming, players[0], players[1]) == true) {
                    break;
                }
            }
            round = round + 1;

        }
        System.out.println("Our Congratulations! Come back again!");
    }
}
