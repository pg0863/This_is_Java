package sec15.exam01_annotation;

import java.lang.reflect.*;

public class PrintAnnotationExam {
	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
	
	
		for(Method method : declaredMethods) {
		// declaredMethods의 배열을 Method 타입으로 선언한 method 객체에 대입.
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
			// PrintAnnotation의 어노테이션이 method객체에 적용되어있다면,
				PrintAnnotation pA = method.getAnnotation(PrintAnnotation.class);
				/*
				System.out.println(method.getName() + ": ");
				System.out.println("value = "+pA.value());
				System.out.println("number = "+pA.number());
				System.out.println();
				*/
				// 메소드 이름 출력
				System.out.println("{"+method.getName()+"}");
				
				// 구분선 출력
				for(int i=0; i<pA.number(); i++) {
					System.out.print(pA.value());
				}
				System.out.println();
				System.out.println();
				
				// 메소드 호출
				try {
					method.invoke(new Service());
				} catch (Exception e) { 			
				}
				// 이 메소드 객체를 이용해서 해당 메소드를 호출
				// Service 객체를 만들어서 호출하겠다.
				// Service service = new Service();
				// service.method1();
				
			}
		}
	}
}
