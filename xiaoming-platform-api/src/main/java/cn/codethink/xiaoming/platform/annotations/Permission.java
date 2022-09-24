package cn.codethink.xiaoming.platform.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <h1>指令权限</h1>
 *
 * <p>用于标注注解注册的指令权限</p>
 *
 * @author Chuanwise
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Permission {
    
    /**
     * 获取参数名
     *
     * @return 参数名
     */
    String[] value();
}
