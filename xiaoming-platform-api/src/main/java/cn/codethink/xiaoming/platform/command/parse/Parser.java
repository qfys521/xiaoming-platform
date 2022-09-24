package cn.codethink.xiaoming.platform.command.parse;

/**
 * <h1>参数解析器</h1>
 *
 * <p>用于将输入指令解析为某类型的参数</p>
 *
 * @author Chuanwise
 */
public interface Parser<T> {
    
    /**
     * 获取解析的目标类型
     *
     * @return 解析的目标类型
     */
    Class<T> getTargetClass();
    
    /**
     * 解析指令参数
     *
     * @param context 指令参数解析上下文
     * @return 解析得的指令参数
     * @throws Exception 解析过程中的异常
     */
    T parse(CommandArgumentParseContext context) throws Exception;
}
