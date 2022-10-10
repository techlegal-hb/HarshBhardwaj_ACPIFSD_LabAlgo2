package PayMoney;

import java.util.Scanner;

public class PayMoney {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of transaction array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the values of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the total no of targets that needs to be achieved: ");
        int noOfTargets = input.nextInt();

        while (noOfTargets-- != 0) {
            int flag = 0;
            System.out.println("Enter the value of target: ");
            long target = input.nextInt();
            long arraySum = 0;
            for (int i = 0; i < size; i++) {
                arraySum += arr[i];
                if (arraySum >= target) {
                    System.out.println("Target achieved after " + (i + 1) + " transactions ");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Given target is not achieved!");
            }
        }
        input.close();
    }
}