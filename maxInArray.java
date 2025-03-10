public class maxInArray 
{
    public static void main(String[] args)
    {
        int[] arr = {1, 4, 78, 56, 28};

        int max = Integer.MIN_VALUE;

        for (int i : arr)
        {
            if (max < i)
            {
                max = i;
            }
        }

        System.out.println("Maximum is: " + max);
    }
}
