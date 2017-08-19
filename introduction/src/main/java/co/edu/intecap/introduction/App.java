package co.edu.intecap.introduction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        App app = new App();
        String msg = app.sayHello("Cesar");
        System.out.println(msg);
    }
    
    public String sayHello(String name) {
    	return "Hola " + name;
    }
}
