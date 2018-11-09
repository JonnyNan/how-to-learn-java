package javaFrameWork.myspring.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @description: Todo
 * @author: JonnyNan
 * @create: 2018-11-08 16:37
 **/
@Aspect
@Component
public class LoggerAspect {

    @Around(value = "execution(* javaFrameWork.myspring.service.ProductService.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("start log:"+ joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end log:"+ joinPoint.getSignature().getName());
        return object;
    }
}
