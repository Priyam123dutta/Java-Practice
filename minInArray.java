public class minInArray 
{
    public static void main(String[] args)
    {
        int[] arr = {1, 4, 78, 56, 28};

        int min = Integer.MAX_VALUE;

        for (int i : arr)
        {
            if (min > i)
            {
                min = i;
            }
        }

        System.out.println("Minimum is: " + min);
    }

}
