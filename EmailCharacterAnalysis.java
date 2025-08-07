import java.util.Scanner;

public class EmailCharacterAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        int vowels = 0, consonants = 0, evenSum = 0, oddCount = 0, specialCharCount = 0;
        for (char ch : email.toCharArray()) {
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                int num = ch - '0';
                if (num % 2 == 0) {
                    evenSum += num;
                } else {
                    oddCount++;
                }
            } else {
                specialCharCount++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Sum of Even Digits: " + evenSum);
        System.out.println("Count of Odd Digits: " + oddCount);
        System.out.println("Special Characters: " + specialCharCount);
    }
}
