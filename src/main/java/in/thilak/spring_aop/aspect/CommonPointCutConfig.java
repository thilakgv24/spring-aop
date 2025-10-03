package in.thilak.spring_aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfig {

    @Pointcut("execution(* in.thilak.spring_aop.business.*.*.*(..))")
    public void businessLayerExecution() {}

    // OR

    @Pointcut("bean(*Service*)")
    public void allPackageConfigUsingBean() {}

    // OR Annotation based pointcut
    // @Pointcut("@annotation(in.thilak.spring_aop.aspect.TrackTime)")

    @Pointcut("@annotation(in.thilak.spring_aop.annotations.TrackTime)")
    public void trackTimeAnnotation() {}
}
