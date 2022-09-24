package cn.codethink.xiaoming.platform.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <h1>监听器</h1>
 *
 * <p>用于标记监听方法</p>
 *
 * @author Chuanwise
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Listener {
    
    /**
     * 询问是否忽略已经被取消的事件
     *
     * @return 是否忽略已经被取消的事件
     */
    boolean ignoreCancelled() default false;
}
