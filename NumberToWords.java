public class NumberToWords {

       private static final String[] units = {
        "", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
        "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    // Array for tens multiples
    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty",
        "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static String convert(int number) {
        if (number == 0) {
            return "Zero";
        }

        if (number < 0) {
            return "Minus " + convert(-number);
        }

        String result = "";

        if (number / 1000 > 0) {
            result += convert(number / 1000) + " Thousand ";
            number %= 1000;
        }

        if (number / 100 > 0) {
            result += convert(number / 100) + " Hundred ";
            number %= 100;
        }

        if (number > 0) {
            if (number < 20) {
                result += units[number];
            } else {
                result += tens[number / 10];
                if (number % 10 > 0) {
                    result += " " + units[number % 10];
                }
            }
        }

        return result.trim();
    }

    public static void main(String[] args) {
        int number = 4321;
        String words = convert(number);
        System.out.println("Number: " + number);
        System.out.println("In Words: " + words);
    }
}
