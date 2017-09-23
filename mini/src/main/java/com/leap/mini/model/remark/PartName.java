package com.leap.mini.model.remark;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author : ylwei
 * @time : 2017/9/18
 * @description :
 */
@Documented
@Target(PARAMETER)
@Retention(RUNTIME)
  public @interface PartName {
  String value() default "";
}