package mytest.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestAop {

	@Pointcut("mytest.aop.service..login")
	public void pointcut(){}
}
