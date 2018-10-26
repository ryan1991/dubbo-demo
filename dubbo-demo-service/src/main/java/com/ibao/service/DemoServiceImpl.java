package com.ibao.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ibao.api.DemoService;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ryan.song on 2018/9/25.
 */
@Service
//@Service("demoService")
public class DemoServiceImpl implements DemoService {
    public List<String> getStudents(Integer classNo) {

        return Arrays.asList("宋军","江花","细雨");
    }
}
