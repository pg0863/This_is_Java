package sec15.exam01_annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD}) //적용 대상 설정. method에만 적용
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
	// int abc default 3; -> 적용 대상 field 포함하지 않았으므로 에러.
}