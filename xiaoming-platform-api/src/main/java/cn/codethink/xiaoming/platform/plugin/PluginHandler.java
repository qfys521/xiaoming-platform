package cn.codethink.xiaoming.platform.plugin;

/**
 * <h1>插件处理器</h1>
 *
 * <p>经典 Jar 插件的插件控制器</p>
 *
 * @author Chuanwise
 */
public interface PluginHandler {
    
    /**
     * 载入插件
     *
     * @param plugin 插件
     * @throws Exception 载入插件时出现的异常
     */
    void onLoad(Plugin plugin) throws Exception;
    
    /**
     * 启动插件
     *
     * @param plugin 插件
     * @throws Exception 启动插件时出现的异常
     */
    void onEnable(Plugin plugin) throws Exception;
    
    /**
     * 关闭插件
     *
     * @param plugin 插件
     * @throws Exception 关闭插件时出现的异常
     */
    void onDisable(Plugin plugin) throws Exception;
}
