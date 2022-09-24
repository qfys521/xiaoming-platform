package cn.codethink.xiaoming.platform.event.listener;

/**
 * <h1>事件监听器</h1>
 *
 * @param <T> 事件类型
 */
public interface Listener<T> {
    
    /**
     * 监听事件
     *
     * @param event 事件
     * @throws Exception 监听事件过程中的异常
     */
    void listen(T event) throws Exception;
    
    /**
     * 获取事件类型
     *
     * @return 事件类型
     */
    Class<T> getEventClass();
}
