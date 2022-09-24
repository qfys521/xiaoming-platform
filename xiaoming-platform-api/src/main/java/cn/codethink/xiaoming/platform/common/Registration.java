package cn.codethink.xiaoming.platform.common;

/**
 * <h1>注册项</h1>
 *
 * <p>某种支持注册的组件，用于记录注册值及注册主体。</p>
 *
 * @param <T> 注册值类型
 * @author Chuanwise
 */
public interface Registration<T> {
    
    /**
     * 获取注册值
     *
     * @return 注册值
     */
    T getValue();
    
    /**
     * 修改注册值
     *
     * @param t 注册值
     * @return 修改前的注册值
     * @throws NullPointerException t 为 null
     */
    T setValue(T t);
    
    /**
     * 获取注册主体
     *
     * @return 注册主体
     */
    Subject getSubject();
}
