import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 10);
        System.out.println("I have a number, try to find it!");
        for (int i = 0; i <= 3; i++) {
            System.out.println("Enter your number!");
            int userNum = scanner.nextInt();
            if (randomNum == userNum) {
                System.out.println("Good choise buddy!");
                break;
            }
            else if (i == 3) {
                System.out.println("You should try tomorrow!");
            }
            else{
                System.out.println("Next turn brotha!");
            }
        }
    }
}