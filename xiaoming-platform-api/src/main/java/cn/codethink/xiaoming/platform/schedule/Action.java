package cn.codethink.xiaoming.platform.schedule;

/**
 * <h1>动作</h1>
 *
 * <p>可以执行的一段代码</p>
 *
 * @author Chuanwise
 */
@FunctionalInterface
public interface Action {
    
    /**
     * 执行动作
     *
     * @param context 动作执行的上下文
     * @throws Exception 动作执行过程中的异常
     */
    void action(TaskContext context) throws Exception;
}
