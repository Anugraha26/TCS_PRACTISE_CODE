import java.util.Scanner;
public class Amstrongnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int temp = num;
        int digits = 0;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        temp = num;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp = temp / 10;
        }
        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}