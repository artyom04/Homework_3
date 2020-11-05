public class Loops {
    public static void main(String[] args) {

        //Task 1 - Create an array and fill it with 2 number
        System.out.println("Task 1: Create an array and fill it with 2 number.");

        int[] arrayTaskOne = new int[16];
        for (int i = 0; i < arrayTaskOne.length; i++) {
            arrayTaskOne[i] = 2;
        }
        for (int i = 0; i < arrayTaskOne.length; i++) {
            System.out.print(arrayTaskOne[i] + " ");
        }
        System.out.println();

        //Task 2 - Create an array and fill it with numbers from 1:1000
        System.out.println("Task 2: Create an array and fill it with numbers from 1:1000.");

        int[] arrayTaskTwo = new int[1000];
        for (int i = 0; i < arrayTaskTwo.length; i++) {
            arrayTaskTwo[i] = i + 1;
        }
        for (int i = 0; i < arrayTaskTwo.length; i++) {
            System.out.print(arrayTaskTwo[i] + " ");
        }
        System.out.println();

        //Task 3 - Create an array and fill it with odd numbers from -20:20
        System.out.println("Task 3: Create an array and fill it with odd numbers from -20:20.");

        int[] arrayTaskThree = new int[20];
        for (int i = 0, j = -19; i < arrayTaskThree.length; i++, j += 2) {
            arrayTaskThree[i] = j;
        }
        for (int i = 0; i < arrayTaskThree.length; i++) {
            System.out.print(arrayTaskThree[i] + " ");
        }
        System.out.println();

        //Task 4 - Create an array and fill it. Print all elements which can be divided by 5
        System.out.println("Task 4: Create an array and fill it. Print all elements which can be divided by 5.");

        int[] arrayTaskFour = {14, -5, 5, 78, 52, 36, 105, 101, 17};
        for (int i = 0; i < arrayTaskFour.length; i++) {
            if (arrayTaskFour[i] % 5 == 0) {
                System.out.print(arrayTaskFour[i] + " ");
            }
        }
        System.out.println();
        //Task 5 - Create an array and fill it. Print all elements which are between 24.12 and 467.23
        System.out.println("Task 5: Create an array and fill it. Print all elements which are between 24.12 and 467.23.");

        double[] arrayTaskFive = {24.13, 25.36, -25.48, -2.5, 0, 14.75, 105.658, 1.2, 1785.5, 145.85, 120};
        for (int i = 0; i < arrayTaskFive.length; i++) {
            if (arrayTaskFive[i] < 467.23 && arrayTaskFive[i] > 24.12) {
                System.out.print(arrayTaskFive[i] + " ");
            }
        }
        System.out.println();

        //Task 6 - Create an array and fill it. Print count of elements which can be divided by 2
        System.out.println("Task 6: Create an array and fill it. Print count of elements which can be divided by 2.");

        int[] arrayTaskSix = {-14, 0, -25, 14, -3, 48, 75, 105, 6985, 5474, -3624, 143};
        int count = 0;
        for (int i = 0; i < arrayTaskSix.length; i++) {
            if (arrayTaskSix[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);

        //Task 7 - Given an integer, 0< N < 21 , print its first 10 multiples.
        //Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.
        System.out.println("Task 7: Given an integer, 0< N < 21 , print its first 10 multiples. Each multiple  N x i " +
                "(where 0<i<11) should be printed on a new line in the form: N x i = result.");

        int N = 14;
        for (int i = 1; i < 11; i++) {
            System.out.println(N + " x " + i + " = " + N * i);
        }

        //Task 8 - Optional
        System.out.println("Task 8: Optional");
        int[] arrayTaskEight = {4, 5, 4, 6, 4, 5, 6, 7, 8, 7, 8};
        int element = arrayTaskEight[0];
        for (int i = 1; i < arrayTaskEight.length; i++) {
            element = arrayTaskEight[i] ^ element;
        }
        System.out.println(element);
    }
}