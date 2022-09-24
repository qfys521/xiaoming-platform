package cn.codethink.xiaoming.platform.logger;

/**
 * <h1>日志工厂</h1>
 *
 * <p>用于获取或创造日志记录器</p>
 *
 * @author Chuanwise
 */
public interface LoggerFactory {
    
    /**
     * 获取日志记录器
     *
     * @param logName 日志记录器名
     * @return 日志记录器
     * @throws NullPointerException     logName 为 null
     * @throws IllegalArgumentException logName 为空串
     */
    Logger getInstance(String logName);
    
    /**
     * 获取日志记录器
     *
     * @param logClass 日志记录器类
     * @return 日志记录器
     * @throws NullPointerException logClass 为 null
     */
    Logger getInstance(Class<?> logClass);
}