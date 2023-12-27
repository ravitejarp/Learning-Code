//package com.ravi.spring;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class DrawingApplication {
//	/**
//	 *
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// Triangle triangle = new Triangle();
//
//		@SuppressWarnings({ "resource" })
//		// BeanFactory factory = new XmlBeanFactory(new FileSystemResource(
//		// "spring.xml"));
//		ApplicationContext context = new ClassPathXmlApplicationContext(
//				"spring.xml");
//
//		Triangle triangleBean = (Triangle) context.getBean("triangle");
//		triangleBean.draw();
//		System.out.println(triangleBean.getHeight());
//		System.out.println(triangleBean.getType());
//
//	}
//}
