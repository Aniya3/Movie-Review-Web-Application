package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 对所有的路径应用CORS设置
                .allowedOrigins("http://localhost:3000") // 允许来自这个域的请求
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 允许的请求方法
                .allowedHeaders("*") // 允许所有的请求头
                .allowCredentials(true) // 允许携带凭证，如Cookies
                .maxAge(3600); // 预检请求的缓存时间（单位：秒）
    }
}
