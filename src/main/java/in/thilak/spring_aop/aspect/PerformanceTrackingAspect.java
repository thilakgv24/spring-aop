package in.thilak.spring_aop.aspect;

import java.util.Date;
import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class PerformanceTrackingAspect {

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Around("execution(* in.thilak.spring_aop.business.*.*.*(..))") //@Pointcut(execution(* Package.Class.method(..)))
    public Object trackPerformance(ProceedingJoinPoint joinPoint) throws Throwable {
        Object returnValue = joinPoint.proceed();
        //start timer
       long startTime =  System.currentTimeMillis();
        // Code to track performance

        long endTime =  System.currentTimeMillis();
        long executionTime = endTime - startTime;
        logger.info("Around Aspect - Method execution time: " + executionTime + " milliseconds And Method: " + returnValue);
        return returnValue;
    }

}
