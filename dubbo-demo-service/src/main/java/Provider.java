import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by ryan.song on 2018/9/25.
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationConetxt.xml");
        ac.start();
        System.out.println("---服务已经启动， 按任意键退出--------");
        System.in.read();

    }

}
