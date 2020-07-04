package com.atguigu.web.listenter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class HelloListener implements ServletContextListener {
        @Override
        public void contextInitialized(ServletContextEvent arg0) {
            System.out.println("应用启动了....HelloListener");
        }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("应用销毁了....HelloListener");
    }
}

