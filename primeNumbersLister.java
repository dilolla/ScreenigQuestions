package main;

import java.util.ArrayList;

public class primeNumbersLister {

    public static void main(String args[]) {

        ArrayList numbers = primeNumbers(100);
        System.out.println("Quantity: "+numbers.size());
        for (int i=0; i<numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }

    public static ArrayList primeNumbers(int quantity){
        ArrayList primeNumbers = new ArrayList<>();
        for (int i = 0; i < quantity; i++){
            int value = i+1;

            int dividers = 0;

            if(value <= quantity){
                for (int j = value; j > 0; j--) {
                    if (value%j == 0) {
                        dividers++;
                    }
                }
                if (dividers == 2) primeNumbers.add(value);
            }
        }

        return primeNumbers;
    }
}
