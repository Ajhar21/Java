import jakarta.servlet.http.HttpServlet;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App {
    public static void main(String[] args) throws LifecycleException, InterruptedException {
        System.out.println("Hello world!");

        Tomcat tomcat=new Tomcat();
        tomcat.setPort(8080);   //optional
        tomcat.getConnector();  //this line is must

        Context context=tomcat.addContext("",null);
        Tomcat.addServlet(context, "SampleServlet", new SampleServlet());
        context.addServletMappingDecoded("/hello","SampleServlet");

        tomcat.start();
        tomcat.getServer().await();

    }
}
