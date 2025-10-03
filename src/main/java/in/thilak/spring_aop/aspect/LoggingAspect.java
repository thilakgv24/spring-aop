package in.thilak.spring_aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    //@Pointcut(execution(* Package.Class.method(..)))
    @Before("in.thilak.spring_aop.aspect.CommonPointCutConfig.businessLayerExecution()")  // A common point cut reference
    public void logMethodBeforeCall(JoinPoint joinPoint) {
        // define the pointcut expression to match the methods you want to log
        logger.info("Before Aspect - Method is called - {}", joinPoint);
    }

    @After("execution(* in.thilak.spring_aop.business.*.*.*(..))") //@Pointcut(execution(* Package.Class.method(..)))
    public void logMethodAfterCall(JoinPoint joinPoint) {
        // define the pointcut expression to match the methods you want to log
        logger.info("After Aspect - Method executed - {}", joinPoint.getSignature());
    }

    @AfterReturning("execution(* in.thilak.spring_aop.business.*.*.*(..))") //@Pointcut(execution(* Package.Class.method(..)))
    public void logMethodAfterReturningCall(JoinPoint joinPoint) {
        // define the pointcut expression to match the methods you want to log
        logger.info("After Aspect - Method executed - {}", joinPoint.getSignature());
    }

    @AfterThrowing("execution(* in.thilak.spring_aop.business.*.*.*(..))") //@Pointcut(execution(* Package.Class.method(..)))
    public void logMethodAfterThrowingCall(JoinPoint joinPoint) {
        // define the pointcut expression to match the methods you want to log
        logger.info("After Aspect - Method executed - {}", joinPoint.getSignature());
    }

}
