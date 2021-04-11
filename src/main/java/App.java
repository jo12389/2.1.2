import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean1 = applicationContext.getBean(Cat.class);
        Cat catBean2 = applicationContext.getBean(Cat.class);
        System.out.println(bean.getMessage());
        System.out.println(bean.equals(bean1));
        System.out.println(catBean1.equals(catBean2));
    }
}