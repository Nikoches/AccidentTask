package ru.job4j;


import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import ru.job4j.Configs.HbmConfig;
import ru.job4j.Configs.SecurityConfig;
import ru.job4j.Configs.WebConfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class WebInit implements WebApplicationInitializer {

    public void onStartup(ServletContext servletCxt) {
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        //ac.refresh();
        ac.scan("job4j");
        ac.register(WebConfig.class, HbmConfig.class, SecurityConfig.class);
        DispatcherServlet servlet = new DispatcherServlet(ac);
        ServletRegistration.Dynamic registration = servletCxt.addServlet("app", servlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");

    }
}
