package cn.codethink.xiaoming.platform.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <h1>指令格式</h1>
 *
 * <p>用于标注注解注册的指令格式</p>
 *
 * @author Chuanwise
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Command {
    
    /**
     * 获取参数名
     *
     * @return 参数名
     */
    String[] value();
}
