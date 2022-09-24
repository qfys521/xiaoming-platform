package cn.codethink.xiaoming.platform;

import cn.codethink.xiaoming.platform.command.CommandManager;
import cn.codethink.xiaoming.platform.event.EventManager;
import cn.codethink.xiaoming.platform.plugin.PluginManager;
import cn.codethink.xiaoming.platform.service.ServiceManager;
import cn.codethink.xiaoming.platform.terminal.TerminalManager;

/**
 * <h1>小明平台</h1>
 *
 * <p>小明平台用于沟通小明各组件，并用于控制小明的状态。</p>
 *
 * @author Chuanwise
 */
public interface Platform {
    
    /**
     * 获取事件管理器
     *
     * @return 事件管理器
     */
    EventManager getEventManager();
    
    /**
     * 获取服务管理器
     *
     * @return 服务管理器
     */
    ServiceManager getServiceManager();
    
    /**
     * 获取终端管理器
     *
     * @return 终端管理器
     */
    TerminalManager getTerminalManager();
    
    /**
     * 获取插件管理器
     *
     * @return 插件管理器
     */
    PluginManager getPluginManager();
    
    /**
     * 获取指令管理器
     *
     * @return 指令管理器
     */
    CommandManager getCommandManager();
}
