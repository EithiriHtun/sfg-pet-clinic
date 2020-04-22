package spring.web.app.springwepapp.Services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean,
        BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean(){
        System.out.println("#I am the LifeCycleDemoBean Constructor:");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("#The LifeCycle bean has been terminated:");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("#The LifeCycleBean has its properties set:");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("#Bean Factory has been set:");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("#My bean name is:"+ s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("#Application Context has been set:");
    }

    @PostConstruct
    public void PostConstruct() {
        System.out.println("#The Post Construct annotated method has been called:");
    }

    @PreDestroy
    public void PreDestroy(){
        System.out.println("#The Pre Destroy annotated method has been called:");
    }

    public void beforeInit(){
        System.out.println("#Before Init- Called by been post Processor:");
    }

    public void afterInit(){
        System.out.println("#After Init- Called by been post Processor:");
    }
}
