import com.ibao.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ryan.song on 2018/9/25.
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("consumer.xml");
        ac.start();
        DemoService demoService = (DemoService) ac.getBean("demoService");
        System.out.println(demoService.getStudents(1));



    }

}
