package javaFrameWork.myspring.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * @description: Todo
 * @author: JonnyNan
 * @create: 2018-11-08 16:37
 **/
@Component
public class LoggerAspect {

    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("start log:"+ joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end log:"+ joinPoint.getSignature().getName());
        return object;
    }
}
