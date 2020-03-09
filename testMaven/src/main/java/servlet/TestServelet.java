package servlet;

import dao.TestDao;
import dao.TestDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: 软件171 邱忠玉 201707163
 * @Date: 2020/3/5 11:49
 */
@WebServlet("/test")
public class TestServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao testDao = (TestDaoImpl) applicationContext.getBean("testDao");
        testDao.sayHello();
        resp.getWriter().println("Hello baby");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
