package com.kedarnath;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//Annotations provide metadata about the code, and reflection allows you to inspect
//and manipulate classes and objects at runtime.

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test{
	String value() default "";
}

//Class using the custom annotation
class TestClass {
 @Test("This is a test method")
 public void testMethod() {
     System.out.println("Test method executed");
 }
}

public class JavaReflection {
	 public static void main(String[] args) throws Exception {
	        TestClass obj = new TestClass();
	        Method[] methods = obj.getClass().getMethods();

	        for (Method method : methods) {
	            if (method.isAnnotationPresent(Test.class)) {
	                Test annotation = method.getAnnotation(Test.class);
	                System.out.println("Found method: " + method.getName() + " with annotation value: " + annotation.value());
	                method.invoke(obj);
	            }
	        }
	    }
}
