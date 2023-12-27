//package com.ravi.spring;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class DrawingAppCollectionInjection {
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
//				"springCollectionInjection.xml");
//
//		TriangleCollectionInjection triangleBean = (TriangleCollectionInjection) context
//				.getBean("triangle");
//		triangleBean.draw();
//
//	}
//}
