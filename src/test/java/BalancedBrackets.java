// import org.junit.Test;
// import static org.junit.Assert.*;

// public class BalancedBracketsTest {
//   @Test
//   pubic void testIsBalanced() {
//     assertTrue(BalancedBrackets.isBalanced("({[]<>})"));
//     assertFalse(BalancedBrackets.isBalanced("({[<>]})"));
//   }
// }

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class BalancedBracketsTest {
    private String input;
    private boolean expected;

    public BalancedBracketsTest(String input, boolean expected) {
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testCases() {
        return Arrays.asList(newObject[][] {
            {"({[]<>})", true},
            {"({[<>]})", false},
            {"", true},
            {"()", true},
            {"{}", true},
            {"[]", true},
            {"<>", true},
            {"({})", true},
            {"[<>]", true},
            {"({[<>]})", false},
            {"({[<>})", false},
            {"({[<>]})", false},
            {"({[<>]})", false},
            {"({[<>]})", false},
            {"({[<>]})", false},
            {"({[<>]})", false},
            {"({[<>]})", false},
            {"({[<>]})", false},
            {"({[<>]})", false}
        });
    }

    @Test
    public void testIsBalanced() {
        assertEquals(expected, BalancedBrackets.isBalanced(input));
    }
}