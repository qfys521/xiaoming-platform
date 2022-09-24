package cn.codethink.xiaoming.platform.event;

/**
 * @see cn.codethink.xiaoming.platform.event.Event
 * @author Chuanwise
 */
public class AbstractCancellableEvent
    extends AbstractEvent
    implements CancellableEvent {
    
    /**
     * 取消状态
     */
    private volatile boolean cancelled = false;
    
    @Override
    public boolean setCancelled(boolean cancelled) {
        if (this.cancelled == cancelled) {
            return false;
        } else {
            this.cancelled = cancelled;
            return true;
        }
    }
    
    @Override
    public boolean isCancelled() {
        return cancelled;
    }
}
