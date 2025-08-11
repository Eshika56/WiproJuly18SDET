package labsession.lab18072025;

public class SwapExample {
    public static void Swap(String[] args) {
        int a = 5, b = 10, temp;
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
}

