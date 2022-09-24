package cn.codethink.xiaoming.platform.event;

/**
 * <h1>事件</h1>
 *
 * <p>表示某个操作</p>
 *
 * @author Chuanwise
 */
public interface Event {
    
    /**
     * 判断事件是否被拦截
     *
     * @return 事件是否被拦截
     */
    boolean isIntercepted();
    
    /**
     * 设置事件拦截状态
     *
     * @param intercepted 事件拦截状态
     * @return 事件拦截状态是否被修改
     */
    boolean setIntercepted(boolean intercepted);
}