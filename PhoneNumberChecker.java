import java.util.Scanner;

public class PhoneNumberChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a four-digit phone number: ");
        String phoneNumber = scanner.nextLine();


        if (phoneNumber.length() != 4) {
            System.out.println("Invalid input. Please enter a four-digit phone number.");
            scanner.close();
            return;
        }


        char firstDigit = phoneNumber.charAt(0);
        char secondDigit = phoneNumber.charAt(1);
        char thirdDigit = phoneNumber.charAt(2);
        char fourthDigit = phoneNumber.charAt(3);

        boolean isFirstDigitTelemarketer = firstDigit == '8' || firstDigit == '9';
        boolean isFourthDigitTelemarketer = fourthDigit == '8' || fourthDigit == '9';
        boolean areSecondAndThirdDigitsSame = secondDigit == thirdDigit;


        if ((firstDigit == '8' || firstDigit == '9') && (fourthDigit == '8' || fourthDigit == '9') && (secondDigit == thirdDigit)) {
            System.out.println("This is a telemarketer's number. Ignore the call.");
        } else {
            System.out.println("This is not a telemarketer's number. Answer the call.");
        }


        scanner.close();
    }
}
