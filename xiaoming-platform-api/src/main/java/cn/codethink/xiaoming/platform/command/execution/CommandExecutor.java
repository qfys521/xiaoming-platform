package cn.codethink.xiaoming.platform.command.execution;

/**
 * <h1>指令处理器</h1>
 *
 * <p>处理指令执行</p>
 *
 * @author Chuanwise
 */
@FunctionalInterface
public interface CommandExecutor {
    
    /**
     * 执行指令
     *
     * @param context 指令执行环境
     * @throws Exception 执行指令过程中抛出的异常
     */
    void execute(CommandExecutionContext context) throws Exception;
}
