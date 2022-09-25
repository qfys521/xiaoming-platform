package cn.codethink.xiaoming.platform.common;

/**
 * <h1>主体</h1>
 *
 * <p>可以注册某种组件（监听器、指令、服务、权限等）的对象、进行某些操作（广播事件等）的对象。</p>
 *
 * @author Chuanwise
 */
public interface Subject {
    
    /**
     * 获取主体名
     *
     * @return 主体名
     */
    String getName();
    
    /**
     * 获取主体显示名
     *
     * @return 主体显示名
     */
    String getDisplayName();
    
    
}
