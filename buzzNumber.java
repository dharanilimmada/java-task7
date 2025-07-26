public class BuzzNumberCheck {
    public static void main(String[] args) {
        int[] numbers = {127, 35};
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            int lastDigit = num % 10;
            if (num % 7 == 0 || lastDigit == 7) {
                System.out.println(num + " is a Buzz Number");
            } else {
                System.out.println(num + " is NOT a Buzz Number");
            }
        }
    }
}
