import org.junit.Test;

public class MissingNumberPerformanceTest {
    @Test(timeout = 1000)
    public void testMissingNumberPerformance() {
        int[] numbers = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            numbers[i] = i + 1;
        }
        int maxNum = 1000000;

        MissingNumber.missingNumber(numbers, maxNum);
    }
}