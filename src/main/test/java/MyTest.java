import com.magidragon.pojo.information;
import com.magidragon.service.informationService;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resources;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringApplication.xml");
        informationService informationServiceImpl =
                (informationService) context.getBean("informationServiceImpl");
        for (information information : informationServiceImpl.queryAllInformation()) {
            System.out.println(information);
        }
    }
}
