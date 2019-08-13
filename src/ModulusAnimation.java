public class ModulusAnimation
{
    public static void main( String[] args ) throws Exception
    {
        for ( int i=0; i<80; i++ )
        {
            if ( i %10 == 0 )
                System.out.print("=====. \r");
            else if ( i%2 == 0 )
                System.out.print("    ====== \r");
            else if ( i%3 == 0 )
                System.out.print("        ====== \r");
            else if ( i%4 == 0 )
                System.out.print("               ======= \r");
            else if ( i%5 == 0 )
                System.out.print("                     ======= \r");
            else if ( i%6 == 0 )
                System.out.print("                ======= \r");
            else if ( i%7 == 0 )
                System.out.print("         ====== \r");
            else if ( i%8 == 0 )
                System.out.print(" ========= \r");

            Thread.sleep(200);
        }

    }
}

//Add several if statements in ModulusAnimation.java
// so that it draws a little animation of your
// choosing. You must have a minimum of eight (8)
// different frames of animation, and it must loop
// smoothly.