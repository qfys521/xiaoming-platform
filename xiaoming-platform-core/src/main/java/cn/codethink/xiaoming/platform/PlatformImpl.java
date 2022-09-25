package cn.codethink.xiaoming.platform;

import cn.codethink.xiaoming.platform.command.CommandManager;
import cn.codethink.xiaoming.platform.dependency.DependencyManager;
import cn.codethink.xiaoming.platform.event.EventManager;
import cn.codethink.xiaoming.platform.plugin.PluginManager;
import cn.codethink.xiaoming.platform.schedule.ScheduleManager;
import cn.codethink.xiaoming.platform.service.ServiceManager;
import cn.codethink.xiaoming.platform.terminal.TerminalManager;
import jdk.nashorn.internal.ir.Terminal;

public class PlatformImpl
    implements Platform {
    
    private EventManager eventManager;
    
    private ServiceManager serviceManager;
    
    private TerminalManager terminalManager;
    
    private CommandManager commandManager;
    
    private ScheduleManager scheduleManager;
    
//    private DependencyManager dependencyManager;
    
    private PluginManager pluginManager;
    
    @Override
    public EventManager getEventManager() {
        return eventManager;
    }
    
    @Override
    public ServiceManager getServiceManager() {
        return serviceManager;
    }
    
    @Override
    public TerminalManager getTerminalManager() {
        return terminalManager;
    }
    
    @Override
    public PluginManager getPluginManager() {
        return pluginManager;
    }
    
    @Override
    public CommandManager getCommandManager() {
        return commandManager;
    }
    
    @Override
    public ScheduleManager getScheduleManager() {
        return scheduleManager;
    }
    
//    @Override
//    public DependencyManager getDependencyManager() {
//        return dependencyManager;
//    }
}
