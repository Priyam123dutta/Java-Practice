public class stringToCharArray 
{
    public static void main(String[] args)
    {
        String str = "Hello";

        char[] word = str.toCharArray();

        for (char i : word)
        {
            System.out.print(i + ", ");
        }
    }
}
