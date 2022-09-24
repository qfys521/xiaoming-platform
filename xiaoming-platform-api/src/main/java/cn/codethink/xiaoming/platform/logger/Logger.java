package cn.codethink.xiaoming.platform.logger;

/**
 * <h1>日志记录器</h1>
 *
 * <p>用于发送和记录日志</p>
 *
 * @author Chuanwise
 */
public interface Logger {
    
    /**
     * 发布轨迹等级的日志
     *
     * @param log       日志
     * @param arguments 日志参数
     */
    void trace(String log, Object... arguments);
    
    /**
     * 发布轨迹等级的日志
     *
     * @param log       日志
     * @param exception 异常信息
     * @param arguments 日志参数
     */
    void trace(String log, Throwable exception, Object... arguments);
    
    /**
     * 发布调试等级的日志
     *
     * @param log       日志
     * @param arguments 日志参数
     */
    void debug(String log, Object... arguments);
    
    /**
     * 发布调试等级的日志
     *
     * @param log       日志
     * @param exception 异常信息
     * @param arguments 日志参数
     */
    void debug(String log, Throwable exception, Object... arguments);
    
    /**
     * 发布标准等级的日志
     *
     * @param log       日志
     * @param arguments 日志参数
     */
    void info(String log, Object... arguments);
    
    /**
     * 发布标准等级的日志
     *
     * @param log       日志
     * @param exception 异常信息
     * @param arguments 日志参数
     */
    void info(String log, Throwable exception, Object... arguments);
    
    /**
     * 发布成功等级的日志
     *
     * @param log       日志
     * @param arguments 日志参数
     */
    void success(String log, Object... arguments);
    
    /**
     * 发布成功等级的日志
     *
     * @param log       日志
     * @param exception 异常信息
     * @param arguments 日志参数
     */
    void success(String log, Throwable exception, Object... arguments);
    
    /**
     * 发布警告等级的日志
     *
     * @param log       日志
     * @param arguments 日志参数
     */
    void warning(String log, Object... arguments);
    
    /**
     * 发布警告等级的日志
     *
     * @param log       日志
     * @param exception 异常信息
     * @param arguments 日志参数
     */
    void warning(String log, Throwable exception, Object... arguments);
    
    /**
     * 发布错误等级的日志
     *
     * @param log       日志
     * @param arguments 日志参数
     */
    void error(String log, Object... arguments);
    
    /**
     * 发布错误等级的日志
     *
     * @param log       日志
     * @param exception 异常信息
     * @param arguments 日志参数
     */
    void error(String log, Throwable exception, Object... arguments);
    
    /**
     * 发布致命等级的日志
     *
     * @param log       日志
     * @param arguments 日志参数
     */
    void fatal(String log, Object... arguments);
    
    /**
     * 发布致命等级的日志
     *
     * @param log       日志
     * @param exception 异常信息
     * @param arguments 日志参数
     */
    void fatal(String log, Throwable exception, Object... arguments);
}
