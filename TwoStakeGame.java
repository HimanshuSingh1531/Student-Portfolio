import java.util.Scanner;
import java.util.Stack;

public class TwoStackGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        // Initialize the stacks with some numbers
        initializeStack(stack1, stack2);

        int currentPlayer = 1;
        boolean gameOver = false;

        while (!gameOver) {
            System.out.println("\nPlayer " + currentPlayer + "'s turn.");
            System.out.println("Stack 1: " + stack1);
            System.out.println("Stack 2: " + stack2);

            System.out.println("Choose a stack (1 or 2): ");
            int stackChoice = scanner.nextInt();

            if (stackChoice == 1) {
                if (!stack1.isEmpty()) {
                    stack1.pop();
                    System.out.println("Player " + currentPlayer + " removed an item from Stack 1.");
                } else {
                    System.out.println("Stack 1 is empty! Player " + currentPlayer + " loses!");
                    gameOver = true;
                    continue;
                }
            } else if (stackChoice == 2) {
                if (!stack2.isEmpty()) {
                    stack2.pop();
                    System.out.println("Player " + currentPlayer + " removed an item from Stack 2.");
                } else {
                    System.out.println("Stack 2 is empty! Player " + currentPlayer + " loses!");
                    gameOver = true;
                    continue;
                }
            } else {
                System.out.println("Invalid stack choice! Please choose either 1 or 2.");
                continue;
            }

            // Switch player
            currentPlayer = (currentPlayer == 1) ? 2 : 1;

            // Check if both stacks are empty
            if (stack1.isEmpty() && stack2.isEmpty()) {
                System.out.println("Both stacks are empty! The game is a draw.");
                gameOver = true;
            }
        }

        scanner.close();
    }

    // Function to initialize the stacks
    private static void initializeStack(Stack<Integer> stack1, Stack<Integer> stack2) {
        // Add numbers to stack1
        stack1.push(5);
        stack1.push(3);
        stack1.push(7);

        // Add numbers to stack2
        stack2.push(6);
        stack2.push(2);
        stack2.push(8);
    }
}
