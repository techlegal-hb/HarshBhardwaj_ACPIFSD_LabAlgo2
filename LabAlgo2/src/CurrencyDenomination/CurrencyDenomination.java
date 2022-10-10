package CurrencyDenomination;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyDenomination {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of currency denominations: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the currency denominations value: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Enter the amount you want to pay: ");
        int amount = input.nextInt();
        int[] counter = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            while (arr[i] <= amount) {
                counter[i] += 1;
                amount -= arr[i];
            }
        }

        System.out.println("Your payment approach in order to give min no of notes will be: ");
        for (int i = size - 1; i >= 0; i--) {
            if (counter[i] > 0) {
                System.out.println(arr[i] + " : " + counter[i]);
            }
        }
        if (amount > 0) {
            System.out.println("The Remaining balance to be paid: " + amount);
        }

        input.close();
    }
}