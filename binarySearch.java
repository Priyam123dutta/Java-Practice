import java.util.Scanner;

public class binarySearch 
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int low = 0, high = 14;

        Scanner sc = new Scanner(System.in);

        int key = sc.nextInt();

        int mid = (high - low) / 2;

        while (low < high)
        {
            if (arr[mid] == key)
            {
                System.out.println("The index is: " + mid);
                sc.close();
                return;
            }
            else if (arr[mid] < key)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        System.out.println("The index is: -1");

        sc.close();
    }
}
