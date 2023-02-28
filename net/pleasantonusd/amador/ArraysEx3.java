package net.pleasantonusd.amador;

public class ArraysEx3 {

    public static <T> void printAll(T[] array) {
        StringBuilder allValues = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            allValues.append(array[i]);
            if (i + 1 < array.length) {
                allValues.append(", ");
            }
        }
        System.out.println(allValues);
    }

    public static void main(String[] args) {

        String input = "lime";

        String[] fruits = {"watermelon", "apple", "grape", "peach", "lemon"};
        //O(n)
        for (int i = 0; i < fruits.length; i++) {
            if (input.equals(fruits[i])) {
                System.out.println("Found!");
                break;
            } else if (i == fruits.length - 1) {
                System.out.println("Not Found :(");
            }
        }
    }
}
