public class Java_NaveenKumar0502_TheVanishingNumber {
    public static void main(String[] args) {
        // Example 1
        int N1 = 5;
        int[] array1 = {1, 2, 4, 5};
        System.out.println("Missing bib number: " + findMissingBib(N1, array1));

        // Example 2
        int N2 = 3;
        int[] array2 = {1, 3};
        System.out.println("Missing bib number: " + findMissingBib(N2, array2));
    }
    public static int findMissingBib(int N, int[] array) {
        // Calculate the expected sum of numbers from 1 to N
        int expectedSum = N * (N + 1) / 2;

       
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
