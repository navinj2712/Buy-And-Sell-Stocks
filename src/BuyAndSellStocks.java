import java.util.Scanner;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        int output = findBuySel(array);
        System.out.println("Output : " + output);
    }

    private static int findBuySel(int[] array) {
        int min = Integer.MAX_VALUE, minIndex = 0;
        for (int i = 0 ; i < array.length; i++){
            if( array[i] < min){
                min = array[i];
                minIndex = i;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = minIndex; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max - min;
    }
}
