package test;

import dao.TestDao;
import dao.TestDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 软件171 邱忠玉 201707163
 * @Date: 2020/3/3 14:44
 */
public class TestMaven {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao testDao = (TestDaoImpl) applicationContext.getBean("testDao");
        testDao.sayHello();
    }

}
