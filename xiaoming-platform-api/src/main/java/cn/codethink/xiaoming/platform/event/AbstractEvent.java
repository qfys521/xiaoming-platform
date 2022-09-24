package cn.codethink.xiaoming.platform.event;

/**
 * @author Chuanwise
 * @see cn.codethink.xiaoming.platform.event.Event
 */
public abstract class AbstractEvent
    implements Event {
    
    /**
     * 拦截状态
     */
    private volatile boolean intercepted = false;
    
    @Override
    public boolean isIntercepted() {
        return intercepted;
    }
    
    @Override
    public boolean setIntercepted(boolean intercepted) {
        // 下面的实现，虽然会产生多次写 intercepted 的情况，但不会导致线程安全问题。
        // TODO: 2022/9/25 测试锁和多次 StoreLoad 的代价差异，并选用最小的实现
        if (this.intercepted == intercepted) {
            return false;
        } else {
            this.intercepted = intercepted;
            return true;
        }
    }
}
