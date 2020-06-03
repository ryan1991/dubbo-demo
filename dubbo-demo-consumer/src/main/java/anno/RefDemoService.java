package anno;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ibao.api.DemoService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RefDemoService {
    @Reference
    private  DemoService demoService;

    public List<String> getStudents(Integer classNo){
        return demoService.getStudents(classNo);
    }

}
