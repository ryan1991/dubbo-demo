package anno;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ryan.song on 2018/9/25.
 */
public class ConsumerAnno {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("consumer-anno.xml");
        ac.start();
        RefDemoService refDemoService = ac.getBean(RefDemoService.class);
        System.out.println(refDemoService.getStudents(1));
    }

}
