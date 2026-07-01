import java.util.Scanner;
public class IntegerToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary value: " + binary);
        sc.close();
    }
}