import java.util.Scanner;

public class swapFirstAndLasIndex 
{
    public static void main(String[] args)
    {
        int[] arr = {1, 4, 78, 56, 28};

        Scanner sc = new Scanner(System.in);

        System.out.println("The values before swap is: " + arr[0] + " & " + arr[4]);

        swap(arr);
        
        System.out.println("The valuse after swap is: " + arr[0] + " & " + arr[4]);

        sc.close();
    }

    static void swap(int[] a)
    {
        a[0] = a[0] + a[4];
        a[4] = a[0] - a[4];
        a[0] = a[0] - a[4];
    }
}
