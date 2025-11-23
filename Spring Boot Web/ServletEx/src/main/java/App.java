import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException, InterruptedException {
        System.out.println("Hello world!");

        Tomcat tomcat=new Tomcat();
        tomcat.start();
        tomcat.getServer().await();

    }
}
