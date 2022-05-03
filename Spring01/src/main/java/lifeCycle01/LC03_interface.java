package lifeCycle01;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("lci")
class LifeCycleTestI implements InitializingBean, DisposableBean  {
	
	public LifeCycleTestI() { System.out.println("~~ LifeCycleTestI 생성자 ~~"); }
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("~~ LifeCycleTestI afterPropertiesSet() ~~");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("~~ LifeCycleTestI destroy() ~~");
	}
	public void list() { System.out.println("~~ LifeCycleTestI list() ~~"); }
	public void login() { System.out.println("~~ LifeCycleTestI login() ~~"); }
} //LifeCycleTestI


public class LC03_interface {

	public static void main(String[] args) {
		AbstractApplicationContext sc = new
				GenericXmlApplicationContext("lifeCycle01/lc01.xml");
		LifeCycleTestI lc = (LifeCycleTestI)sc.getBean("lci");
		lc.login();
		lc.list();
		sc.close();
	} //main

} //class
