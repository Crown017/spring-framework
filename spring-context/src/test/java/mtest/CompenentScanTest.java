package mtest;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CompenentScanTest {

	@Test
	public void TestComponent(){
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
		MyConfig bean = ctx.getBean(MyConfig.class);
		System.out.println(bean);
	}
}
