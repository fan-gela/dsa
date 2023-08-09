public class Main {
    public static void main(String[] args) {
        int[] numbers = { 2, 1, 4, 3, 6, 5, 7, 10, 9 };
        int maxNum = 10;
        System.out.println(missingNumber(numbers, maxNum));
    }

    public static int missingNumber(int[] numbers, int maxNum) {
        int totalSum = maxNum * (maxNum + 1) / 2;
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        int missingNumber = totalSum - sum;
        return missingNumber == 0 ? 0 : missingNumber;
    }
}
