public class BalanceParentheses {
    public static void main(String[] args) {
        System.out.println(isBalanced("(())"));
        System.out.println(isBalance("((())"));
    }

    public static boolean isBalanced(String str) {
        int balance = 0;
        for (char c : str.toCharArray()) {
            if (c == '(') {
                balance++;
            } else if (c == ')') {
                if (balance == 0) {
                    return false;
                }
                balance--;
            }
        }
        return balance == 0;
    }
}