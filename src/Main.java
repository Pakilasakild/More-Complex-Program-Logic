import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0, biggest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        System.out.println("Enter numbers, to stop enter -1: ");
        while (input != -1) {
            if (input == -1) {
                break;
            }
            input = in.nextInt();
            if (input > biggest && input != -1) {
                biggest = input;
            }
            if (input < smallest && input != -1) {
                smallest = input;
            }
        }
        System.out.println("Largest number " + biggest + " Smallest number " + smallest);
    }
}