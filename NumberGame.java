public class NumberGame {

    private static void scanMaxAndMin(int[] numbers) {
        int max = 0, min = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] < min) {
                min = numbers[j];
            }
        }

        System.out.printf("Max is %d and min is %d%n", max, min);
    }

    private static void scanFirstTwoMaxs(int[] numbers) {
        int max = 0, secondMax = 0;
        // Your stuff here
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];

            } else if (numbers[i] > secondMax) {
                secondMax = numbers[i];

            }
        }
        System.out.printf("Max is %d and second max is %d%n", max, secondMax);
    }

    private static void scanFirstThreeMaxs(int[] numbers) {
        int max = 0, secondMax = 0, thirdMax = 0;
        // Your stuff here
        for (int i = 0; i < numbers.length ; i ++)
        {
            /* If current element is smaller than
            first*/
            if (numbers[i] > max)
            {
                thirdMax = secondMax;
                secondMax = max;
                max = numbers[i];
            }

            /* If arr[i] is in between first and
            second then update second  */
            else if (numbers[i] > secondMax)
            {
                thirdMax = secondMax;
                secondMax = numbers[i];
            }

            else if (numbers[i] > thirdMax)
                thirdMax = numbers[i];
        }

        System.out.printf("Max is %d, second max is %d and third max is %d%n", max, secondMax, thirdMax);
    }

    private static void threeSums(int[] numbers) {
        int count = 0;
        // Your stuff here
        for (int i=0; i<numbers.length-2; i++)
        {
            for (int j=i+1; j<numbers.length-1; j++)
            {
                for (int k=j+1; k<numbers.length; k++)
                {
                    if (numbers[i]+numbers[j]+numbers[k] == 0)
                    {
                        count++;
                    }
                }
            }
        }
        System.out.printf("There are %d combinations of 3 numbers that sum of them is 0%n", count);
    }

    public static void main(String[] args) {
        int[] numbers = {-1, -2, 3, -4, -5, 9, 10, 11};
        scanMaxAndMin(numbers);
        scanFirstTwoMaxs(numbers);
        scanFirstThreeMaxs(numbers);
        threeSums(numbers);
    }

}

