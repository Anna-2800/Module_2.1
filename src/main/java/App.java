import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        bean.getMessage();

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        bean2.getMessage();

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        cat1.getMessage();

        Cat cat2 = (Cat) applicationContext.getBean("cat");
        cat2.getMessage();

        boolean compare = bean == bean2;
        boolean compare2 = cat1 == cat2;
        System.out.println(compare);
        System.out.println(compare2);


    }
}