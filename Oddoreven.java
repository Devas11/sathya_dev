import java.io.*;
import java.util.*;
class Oddoreven
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%2==0)
        {
            System.out.println("even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
}
