package net.pleasantonusd.amador;

public class ArraysEx2 {


    public static void main(String[] args) {
        double[] numbers = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        double media = total/ numbers.length;
        System.out.println(media);
    }


}
