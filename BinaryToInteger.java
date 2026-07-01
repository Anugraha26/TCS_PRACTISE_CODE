import java.util.Scanner;
public class BinaryToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = sc.next();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Integer value: " + decimal);
        sc.close();
    }
}