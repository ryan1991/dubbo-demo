# dubbo-demo
运行demo的启动顺序：
1.启动zookeeper(3.4.8)
2.启动提供者dubbo-demo-service中Provider（main方法启动）
3.启动消费者dubbo-demo-consumer中Consumer， anno包下的ConsumerAnno是dubbo的注解方式。

提示：dubbo的注解@Service 和 @Reference是通过spring-dubbo.xml配置自动扫描 和 dubbo注解开启实现的： 
    <context:component-scan base-package="anno"/>
    <dubbo:annotation package="anno"/>
    
