package dev;
import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String banner = FigletFont.convertOneLine("App");
        System.out.println(banner);
    }
}
