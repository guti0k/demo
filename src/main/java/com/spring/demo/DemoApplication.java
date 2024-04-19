package com.spring.demo;

import com.spring.demo.annotation.TestBean;
import com.spring.demo.conditional.ABeanWithCondition;
import com.spring.demo.configProperties.DemoAppProperties;
import com.spring.demo.event.ObjectPublisher;
import com.spring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
@EnableConfigurationProperties(DemoAppProperties.class)
public class DemoApplication {

    @Autowired
    private ObjectPublisher objectPublisher;

    public static ConfigurableApplicationContext applicationContext;


    public static void main(String[] args) {

//        System.out.println("Trước khi IOC Container được tạo");
        applicationContext = SpringApplication.run(DemoApplication.class, args);
//        System.out.println("Sau khi IOC Container được tạo hoàn tất");
//
//
//        GetUtil getUtil = applicationContext.getBean(GetUtil.class);
//        System.out.println("@Value với username: " + getUtil.userName);
//
//
//        System.out.println("Trước khi đối tượng getUtil bị destroy bởi IOC Container");
//        applicationContext.getBeanFactory().destroyBean(getUtil);
//        System.out.println("Sau khi đối tượng getUtil bị destroy bởi IOC Container");
//
//        System.out.println("                   ");
//        checkBeansPresence("getUtil", "userService", "otherBean");
//
//        MyBean myBean = applicationContext.getBean(MyBean.class);
//        myBean.getMessage();
//
//        Driver driver = applicationContext.getBean(Driver.class);
//        driver.printName();
//
//        Biker biker = applicationContext.getBean(Biker.class);
//        biker.printName();
//
//        SpringApplication application = new SpringApplication(DemoApplication.class);
//        ConfigurableEnvironment configurableEnvironment = new StandardEnvironment();
//
//        configurableEnvironment.setActiveProfiles("production");
//        application.setEnvironment(configurableEnvironment);
//
//        ConfigurableApplicationContext context = application.run(args);
//        DatabaseConnectionProvider databaseConnectionProvider = context.getBean(DatabaseConnectionProvider.class);
//        System.out.println(databaseConnectionProvider);

//        DemoAppProperties demoAppProperties = applicationContext.getBean(DemoAppProperties.class);
//        System.out.println(demoAppProperties.toString());

//        ConditionalOnBeanExample conditionalOnBeanExample = applicationContext.getBean(ConditionalOnBeanExample.class);
//        ConditionalOnPropertyExample conditionalOnPropertyExample = applicationContext.getBean(ConditionalOnPropertyExample.class);
//        ConditionalOnExpressionExample conditionalOnExpressionExample = applicationContext.getBean(ConditionalOnExpressionExample.class);
//        ConditionalOnResourceExample conditionalOnResourceExample = applicationContext.getBean(ConditionalOnResourceExample.class);

//        System.out.println(applicationContext.getBean(ABeanWithCondition.class));
    }

    public static void checkBeansPresence(String... beans) {
        for (String beanName: beans) {
            System.out.println("Bean " + beanName + " trong DemoApplication đã được khởi tạo: " + applicationContext.containsBean(beanName));
        }
    }

    @Bean
    CommandLineRunner run() {
        return args -> {
                objectPublisher.sendMessage(new User("Duy Quyền", LocalDate.now(), "Hà Nội", "0987010742"));
            System.out.println("Sự kiện kết thúc.");
        };
    }
}
