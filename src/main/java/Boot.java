import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import x.y.Foo;
import x.y.service.FooService;

public final class Boot {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml", Boot.class);
        FooService fooService = (FooService) context.getBean("fooService");
        fooService.insertFoo(new Foo());
    }
}
