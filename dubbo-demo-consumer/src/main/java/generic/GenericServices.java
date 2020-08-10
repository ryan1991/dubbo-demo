package generic;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.rpc.service.GenericService;

import java.util.List;

public class GenericServices {
    public static void main(String[] args) {


        ApplicationConfig application = new ApplicationConfig();
        application.setName("dubbo-demo-consumer");

        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("zookeeper://127.0.0.1:2181");

        application.setRegistry(registry);

        ReferenceConfig<GenericService> reference = new ReferenceConfig<GenericService>();
        // 弱类型接口名
        reference.setInterface("com.ibao.api.DemoService");
        // 声明为泛化接口
        reference.setGeneric(true);

        reference.setApplication(application);

    // 用com.alibaba.dubbo.rpc.service.GenericService可以替代所有接口引用
        GenericService genericService = reference.get();

        List<String> name = (List<String>) genericService.$invoke("getStudents", new String[]{Integer.class.getName()}, new Object[]{1});
        System.out.println(name);
    }

}
