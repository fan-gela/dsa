import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MissingNumberTest {
    @Test
    public void testFindMissingNumber() {
        int[] numbers = {2, 1, 4, 3, 6, 5, 7, 10, 9};
        int maxNum = 10;
        int expectedMissingNumber = 8;

        int actualMissingNumber = MissingNumber.findMissingNumber(numbers, maxNum);
        assertEquals(expectedMissingNumber, actualMissingNumber);
    }
}