import java.util.Arrays;

public class sortingInbuiltFunction 
{
    public static void main(String[] args)
    {
        int[] arr = {1, 4, 78, 56, 28, 61, 91, 37, 59, 611, 748, 627, 1534, 12, 64};

        Arrays.sort(arr);

        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }
}
