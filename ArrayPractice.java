public class ArrayPractice
{
    public static void printIntArray( int[] array )
    {
        for( int i = 0; i < array.length; i++ )
        {
            System.out.print( array[i] + " " );
        }
        System.out.println();
    }

    public static void printStringArray( String[] array )
    {
        for( int i = 0; i < array.length; i++ )
        {
            System.out.println( array[i] );
        }
    }

    public static void main( String[]args )
    {
        int[] nums = new int[10];
        for( int i = 0; i < nums.length; i++)
        {
            nums[i] = i;
        }
        printIntArray( nums );
        System.out.println();
        
        String[] names = {"Bob", "Jack", "Bryce", "Jacob", "Janet" };
        printStringArray( names );
        System.out.println();
        names[0] = "William"; 
        printStringArray( names );
        
        //add one more name to the array
        //make new array with one more longer than length of original array
        String[] names2 = new String[ names.length + 1 ];
        for( int i = 0; i < nums.length; i++)
        {
            names2[i] = names[i];
        }
        //add the new bane to the last box
        names2[ names2.length-1 ] = "Ella";
        names = names2;
        printStringArray( names );
    }
}