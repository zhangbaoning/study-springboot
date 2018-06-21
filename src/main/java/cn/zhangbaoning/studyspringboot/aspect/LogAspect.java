package cn.zhangbaoning.studyspringboot.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.RequestContext;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * @Description
 * @Author zhangbaoning
 * @Date 2018/6/20
 */
@Aspect
@Component
public class LogAspect {
    Logger logger = LoggerFactory.getLogger(LogAspect.class);
    @Pointcut("execution(public * cn.zhangbaoning.studyspringboot.GirlController.*(..))")
    public void log() {
    }

    @Before("log()")
    public void before(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        logger.info("URL{}",request.getRequestURI());

        logger.info("类方法{}",joinPoint.getSignature().getDeclaringTypeName()+"."+joinPoint.getSignature().getName());

        logger.info("参数"+joinPoint.getArgs().toString());
    }

    @AfterReturning(value = "log()",returning = "object" )
    public void doAfterReturning(Object object){
        System.out.println(object);
    }

    @After("log()")
    public void after(){
        logger.info("日志结束");
    }
}
