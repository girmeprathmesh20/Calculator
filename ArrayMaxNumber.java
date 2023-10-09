public class ArrayMaxNumber {
    public static void main(String[] args) {
        int[] numbers = {67, 89, 56, 788};

        int max = numbers[0];


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print the maximum number
        System.out.println("The maximum number is: " + max);
    }
}
