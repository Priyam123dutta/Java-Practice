public class scondLowest 
{
    public static void main(String[] args)
    {
        int[] arr = {1, 4, 78, 56, 28};

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i : arr)
        {
            if (min > i)
            {
                min = i;
            }
        }

        for (int i : arr)
        {
            if (i != min)
            {
                if (secondMin > i)
                {
                    secondMin = i;
                }
            }
        }

        System.out.println("Second Minimum is: " + secondMin);
    }
}
