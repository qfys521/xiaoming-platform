package cn.codethink.xiaoming.platform.common;

import cn.codethink.xiaoming.platform.event.listener.Listener;

/**
 * <h1>优先级</h1>
 *
 * <p>可注册的组件之间的优先级，如事件监听器 {@link Listener} 和服务。</p>
 *
 * @author Chuanwise
 */
public enum Priority {
    
    /**
     * 最低
     */
    LOWEST,
    
    /**
     * 低
     */
    LOW,
    
    /**
     * 普通
     */
    NORMAL,
    
    /**
     * 高
     */
    HIGH,
    
    /**
     * 最高
     */
    HIGHEST,
}
