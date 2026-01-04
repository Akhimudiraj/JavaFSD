package spring;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainfile {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        Employee e = (Employee) context.getBean("empbean");
        e.display();
        System.out.println(e);
    }
}

