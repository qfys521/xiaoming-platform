package cn.codethink.xiaoming.platform.command.completion;

/**
 * <h1>指令补全器</h1>
 *
 * <p>用于补全指令输入</p>
 *
 * @author Chuanwise
 */
@FunctionalInterface
public interface CommandCompleter {
    
    /**
     * 补全指令
     *
     * @param context 指令补全环境
     * @throws Exception 执行补全过程中抛出的异常
     */
    void complete(CommandCompletionContext context) throws Exception;
}
