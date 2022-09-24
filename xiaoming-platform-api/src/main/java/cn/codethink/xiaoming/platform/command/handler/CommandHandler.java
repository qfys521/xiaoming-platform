package cn.codethink.xiaoming.platform.command.handler;

import cn.codethink.xiaoming.platform.command.completion.CommandCompleter;
import cn.codethink.xiaoming.platform.command.execution.CommandExecutor;

/**
 * <h1>指令处理器</h1>
 *
 * <p>处理指令的执行和补全</p>
 *
 * @author Chuanwise
 */
public interface CommandHandler
    extends CommandExecutor, CommandCompleter {
}
