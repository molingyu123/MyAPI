//package config;
//
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
//@Configuration
//public class DruidConfig {
//
//public DataSource druid() {
//    return new DruidDataSource();
//}
//
//    // 配置Druid的监控
//    // 1、配置一个管理后台的Servlet
//    @Bean
//    public ServletRegistrationBean<StatViewServlet> statViewServlet() {
//        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<StatViewServlet>(new StatViewServlet(), "/druid/*");
//        Map<String, String> initParams = new HashMap<>();
//        initParams.put("loginUsername", "admin");//druid管理的账号
//        initParams.put("loginPassword", "123456");//druid管理的密码
//        initParams.put("allow", "");// 白名单 默认就是允许所有访问
//        initParams.put("deny", ""); //黑名单
//        initParams.put("resetEnable", "false"); //禁用HTML页面上的“Reset All”功能
//        bean.setInitParameters(initParams);
//        return bean;
// }
//
//
//    @Bean
//    public FilterRegistrationBean<WebStatFilter> webStatFilter() {
//        FilterRegistrationBean<WebStatFilter> bean = new FilterRegistrationBean<WebStatFilter>();
//        Map<String, String> initParams = new HashMap<>();
//        initParams.put("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
//        bean.setFilter(new WebStatFilter());
//        bean.setInitParameters(initParams);
//        bean.setUrlPatterns(Arrays.asList("/*"));
//        return bean;
//    }
//
//
//}
