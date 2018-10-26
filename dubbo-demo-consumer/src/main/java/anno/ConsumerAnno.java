package anno;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ibao.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by ryan.song on 2018/9/25.
 */
@Component
public class ConsumerAnno {
    @Reference
    private static DemoService demoService;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("consumer-anno.xml");
        ac.start();

        System.out.println(demoService.getStudents(1));



    }

}
