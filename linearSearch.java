import java.util.Scanner;

public class linearSearch 
{
    public static void main(String[] args)
    {
        int[] arr = {1, 4, 78, 56, 28, 61, 91, 37, 59, 611, 748, 627, 1534, 12, 64};

        Scanner sc = new Scanner(System.in);

        int key = sc.nextInt();

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == key)
            {
                System.out.println("The key found in: " + i + " index");
                sc.close();
                return;
            }
        }

        System.out.println("Not Found");
        sc.close();
    }
}
