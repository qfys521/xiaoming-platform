package cn.codethink.xiaoming.platform.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <h1>指令参数</h1>
 *
 * <p>用于标注注解注册的指令方法参数</p>
 *
 * @author Chuanwise
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface Parameter {
    
    /**
     * 获取参数名
     *
     * @return 参数名
     */
    String value() default "";
}
