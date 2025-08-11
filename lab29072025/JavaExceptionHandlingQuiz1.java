package corejava;

// number 1
public class JavaExceptionHandlingQuiz1 
{
    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Try Block");
        }
        System.out.println("-----");
        catch (Exception e) 
        {
            System.out.println("Catch Block");
        }
    }
}
 
// compilation error here - cannot place any code between the try block and the catch block

 
 
