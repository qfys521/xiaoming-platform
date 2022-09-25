package cn.codethink.xiaoming.platform.event;

import cn.codethink.xiaoming.platform.command.PlatformObject;
import cn.codethink.xiaoming.platform.common.Subject;

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
     * @param event   事件
     * @param subject 事件广播主体
     * @return 事件是否被监听
     * @throws NullPointerException event 为 null
     * @throws NullPointerException subject 为 null
     */
    boolean broadcastEvent(Event event, Subject subject);
}