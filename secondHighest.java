public class secondHighest 
{
    public static void main(String[] args)
    {
        int[] arr = {1, 4, 78, 56, 28};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i : arr)
        {
            if (max < i)
            {
                max = i;
            }
        }

        for (int i : arr)
        {
            if (i != max)
            {
                if (secondMax < i)
                {
                    secondMax = i;
                }
            }
        }

        System.out.println("Second Maximum is: " + secondMax);
    }
}
