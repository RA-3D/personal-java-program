
public class Methods {
    public static int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0; 
        }

        int sum = calculateSum(numbers);
        return (double) sum / numbers.length;
    }

    public static int findMaximum(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMinimum(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = { 5, 10, 3, 8, 15 };

        int sum = calculateSum(numbers);
        System.out.println("Sum: " + sum);

           double average = calculateAverage(numbers);
           System.out.println("Average: " + average);

              int max = findMaximum(numbers);
              System.out.println("Maximum value: " + max);

                 int min = findMinimum(numbers);
                 System.out.println("Minimum value: " + min);
    }
}
