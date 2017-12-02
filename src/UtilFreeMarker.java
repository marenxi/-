import freemarker.template.Configuration;
import freemarker.template.Template;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * Created by ma on 2017/11/24.
 */
public class UtilFreeMarker {
    private static Configuration configuration=null;
    static {
        configuration=new Configuration();
//        try { 路径不存在
//            configuration.setDirectoryForTemplateLoading(new File("templates"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public static void init(ServletContext servletContext) {
        configuration.setEncoding(Locale.CHINA,"UTF-8");
        configuration.setServletContextForTemplateLoading(servletContext,"/WEB-INF/templates");

    }
//    生成模版---将来就是将数据设置到模版上
    public  static Template genTemplate(String templateName){
        try {
            return  configuration.getTemplate(templateName);
        } catch (IOException e) {
            throw new RuntimeException("No Such template");
        }
    }
    //设置数据用的
    public  static Map getRoot(){
        return  new HashMap();
    }
}
