package cn.codethink.xiaoming.platform.command;

// TODO: 2022/9/24 完成指令类的 JavaDoc

import cn.codethink.xiaoming.platform.command.completion.CommandCompleter;
import cn.codethink.xiaoming.platform.command.execution.CommandExecutor;

/**
 * <h1>指令</h1>
 *
 * @author Chuanwise
 */
public interface Command {
    
    /**
     * 获取指令补全器
     *
     * @return 指令补全器
     */
    CommandCompleter getCompleter();
    
    /**
     * 修改指令补全器
     *
     * @param completer 指令补全器
     * @return 修改前的指令补全器
     * @throws NullPointerException completer 为 null
     */
    CommandCompleter setCompleter(CommandCompleter completer);
    
    /**
     * 获取指令执行器
     *
     * @return 指令执行器
     */
    CommandExecutor getExecutor();
    
    /**
     * 修改指令执行器
     *
     * @param executor 指令执行器
     * @return 修改前的指令执行器
     * @throws NullPointerException executor 为 null
     */
    CommandExecutor setExecutor(CommandExecutor executor);
}
