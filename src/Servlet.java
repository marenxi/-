import freemarker.template.Template;
import freemarker.template.TemplateException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * Created by ma on 2017/11/24.
 */
@WebServlet(name = "Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        UtilFreeMarker.init(request.getServletContext());
            //动态数据
        Map map = UtilFreeMarker.getRoot();
        map.put("data1","ABcdEf");
        map.put("data2",33.2);
        map.put("data3","true");
        map.put("htm2","<b>粗体</b>");
        List<Integer> list=new ArrayList<>();
        list.add(1);list.add(3);list.add(5);list.add(7);
        map.put("data4",list);
        Map<String,String> map2=new HashMap();
        map2.put("key1","key1data");
        map2.put("key2","key2data");
        map.put("data5",map2);
        map.put("data6",new Date());
        Integer[] nums=new Integer[]{1,2,3,4,5,77,8,99};
        map.put("nums",nums);
        User user=new User();
        user.setUname("xxx");
        user.setUpwd("123456");
        map.put("user",user);
        map.put("user",user);
        map.put("score1",90);
        map.put("score2",60);
        map.put("score3",30);
        //模板
        Template template = UtilFreeMarker.genTemplate("test1.ftl");
        try {
            //动态数据+模板=静态页面 顺便输出给前端浏览器
            template.process(map,response.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }

    }
}
