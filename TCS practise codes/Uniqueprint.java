public class Uniqueprint {
    public static void main(String[] args) {
        int[] ip1 = {13, 2, 4, 15, 12, 10, 6, 5};
        System.out.print("Input: ");
        printArray(ip1);
        System.out.print("Output: ");
        uniquePrint(ip1);
        int[] ip2 = {5, 4, 3, 1, 2};
        System.out.print("Input: ");
        printArray(ip2);
        System.out.print("Output: ");
        uniquePrint(ip2);
    }
    public static void uniquePrint(int[] arr) {
        java.util.Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        boolean takeFromRight = true;
        while (left <= right) {
            if (takeFromRight) {
                System.out.print(arr[right] + " ");
                right--;
            } else {
                System.out.print(arr[left] + " ");
                left++;
            }
            takeFromRight = !takeFromRight;
        }
        System.out.println();
    } 
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(",");
        }
        System.out.println("]");
    }
}