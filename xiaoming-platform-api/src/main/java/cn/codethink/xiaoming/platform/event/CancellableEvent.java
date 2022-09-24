package cn.codethink.xiaoming.platform.event;

/**
 * <h1>可取消事件</h1>
 *
 * <p>可以取消操作的事件</p>
 *
 * @author Chuanwise
 */
public interface CancellableEvent {
    
    /**
     * 设置事件取消状态
     *
     * @param cancelled 事件取消状态
     * @return 是否修改了事件取消状态
     */
    boolean setCancelled(boolean cancelled);
    
    /**
     * 判断事件是否取消
     *
     * @return 事件是否取消
     */
    boolean isCancelled();
}