package labsession.lab18072025;

public class DivisibilityCheck {
    public static void DivisibilityCheck(String[] args) {
        System.out.print("Enter a number: ");
        int num = 55;

        if (num % 5 == 0 && num % 11 == 0)
            System.out.println(num + " is divisible by 5 and 11.");
        else
            System.out.println(num + " is NOT divisible by 5 and 11.");
    }
}

