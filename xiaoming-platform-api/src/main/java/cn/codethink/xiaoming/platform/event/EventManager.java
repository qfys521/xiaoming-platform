package cn.codethink.xiaoming.platform.event;

import cn.codethink.xiaoming.platform.command.PlatformObject;

/**
 * <h1>事件管理器</h1>
 *
 * <p>管理事件及其监听器的工具</p>
 *
 * @author Chuanwise
 */
public interface EventManager
    extends PlatformObject {
    
    /**
     * 广播事件
     *
     * @param event 事件
     * @return 事件是否被监听
     */
    boolean broadcastEvent(Event event);
}
