package com.yangzhichao.yzclib.strategy.annotation;


import com.yangzhichao.yzclib.strategy.enums.TypeEnum;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Component
@Retention(RetentionPolicy.RUNTIME)
public @interface WorkAnnotation {
    TypeEnum type();
}
