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
     * @param message 日志
     * @throws NullPointerException message 为 null
     */
    void trace(String message);
    
    /**
     * 发布轨迹等级的日志
     *
     * @param format    日志
     * @param arguments 日志参数
     * @throws NullPointerException format 为 null
     * @throws NullPointerException arguments 为 null
     */
    void trace(String format, Object... arguments);
    
    /**
     * 发布轨迹等级的日志
     *
     * @param format   日志
     * @param argument 日志参数
     * @throws NullPointerException format 为 null
     * @throws NullPointerException argument 为 null
     */
    void trace(String format, Object argument);
    
    /**
     * 发布轨迹等级的日志
     *
     * @param message 日志
     * @param cause   异常
     * @throws NullPointerException message 为 null
     * @throws NullPointerException cause 为 null
     */
    void trace(String message, Throwable cause);
    
    /**
     * 发布轨迹等级的日志
     *
     * @param cause 异常
     * @throws NullPointerException cause 为 null
     */
    void trace(Throwable cause);
    
    /**
     * 询问是否启动轨迹等级
     *
     * @return 是否启动轨迹等级
     */
    boolean isTraceEnabled();
    
    /**
     * 发布调试等级的日志
     *
     * @param message 日志
     * @throws NullPointerException message 为 null
     */
    void debug(String message);
    
    /**
     * 发布调试等级的日志
     *
     * @param format    日志
     * @param arguments 日志参数
     * @throws NullPointerException format 为 null
     * @throws NullPointerException arguments 为 null
     */
    void debug(String format, Object... arguments);
    
    /**
     * 发布调试等级的日志
     *
     * @param format   日志
     * @param argument 日志参数
     * @throws NullPointerException format 为 null
     * @throws NullPointerException argument 为 null
     */
    void debug(String format, Object argument);
    
    /**
     * 发布调试等级的日志
     *
     * @param message 日志
     * @param cause   异常
     * @throws NullPointerException message 为 null
     * @throws NullPointerException cause 为 null
     */
    void debug(String message, Throwable cause);
    
    /**
     * 发布调试等级的日志
     *
     * @param cause 异常
     * @throws NullPointerException cause 为 null
     */
    void debug(Throwable cause);
    
    /**
     * 询问是否启动调试等级
     *
     * @return 是否启动调试等级
     */
    boolean isDebugEnabled();
    
    /**
     * 发布标准等级的日志
     *
     * @param message 日志
     * @throws NullPointerException message 为 null
     */
    void info(String message);
    
    /**
     * 发布标准等级的日志
     *
     * @param format    日志
     * @param arguments 日志参数
     * @throws NullPointerException format 为 null
     * @throws NullPointerException arguments 为 null
     */
    void info(String format, Object... arguments);
    
    /**
     * 发布标准等级的日志
     *
     * @param format   日志
     * @param argument 日志参数
     * @throws NullPointerException format 为 null
     * @throws NullPointerException argument 为 null
     */
    void info(String format, Object argument);
    
    /**
     * 发布标准等级的日志
     *
     * @param message 日志
     * @param cause   异常
     * @throws NullPointerException message 为 null
     * @throws NullPointerException cause 为 null
     */
    void info(String message, Throwable cause);
    
    /**
     * 发布标准等级的日志
     *
     * @param cause 异常
     * @throws NullPointerException cause 为 null
     */
    void info(Throwable cause);
    
    /**
     * 询问是否启动标准等级
     *
     * @return 是否启动标准等级
     */
    boolean isInfoEnabled();
    
    /**
     * 发布成功等级的日志
     *
     * @param message 日志
     * @throws NullPointerException message 为 null
     */
    void success(String message);
    
    /**
     * 发布成功等级的日志
     *
     * @param format    日志
     * @param arguments 日志参数
     * @throws NullPointerException format 为 null
     * @throws NullPointerException arguments 为 null
     */
    void success(String format, Object... arguments);
    
    /**
     * 发布成功等级的日志
     *
     * @param format   日志
     * @param argument 日志参数
     * @throws NullPointerException format 为 null
     * @throws NullPointerException argument 为 null
     */
    void success(String format, Object argument);
    
    /**
     * 发布成功等级的日志
     *
     * @param message 日志
     * @param cause   异常
     * @throws NullPointerException message 为 null
     * @throws NullPointerException cause 为 null
     */
    void success(String message, Throwable cause);
    
    /**
     * 发布成功等级的日志
     *
     * @param cause 异常
     * @throws NullPointerException cause 为 null
     */
    void success(Throwable cause);
    
    /**
     * 询问是否启动成功等级
     *
     * @return 是否启动成功等级
     */
    boolean isSuccessEnabled();
    
    /**
     * 发布警告等级的日志
     *
     * @param message 日志
     * @throws NullPointerException message 为 null
     */
    void warning(String message);
    
    /**
     * 发布警告等级的日志
     *
     * @param format    日志
     * @param arguments 日志参数
     * @throws NullPointerException format 为 null
     * @throws NullPointerException arguments 为 null
     */
    void warning(String format, Object... arguments);
    
    /**
     * 发布警告等级的日志
     *
     * @param format   日志
     * @param argument 日志参数
     * @throws NullPointerException format 为 null
     * @throws NullPointerException argument 为 null
     */
    void warning(String format, Object argument);
    
    /**
     * 发布警告等级的日志
     *
     * @param message 日志
     * @param cause   异常
     * @throws NullPointerException message 为 null
     * @throws NullPointerException cause 为 null
     */
    void warning(String message, Throwable cause);
    
    /**
     * 发布警告等级的日志
     *
     * @param cause 异常
     * @throws NullPointerException cause 为 null
     */
    void warning(Throwable cause);
    
    /**
     * 询问是否启动警告等级
     *
     * @return 是否启动警告等级
     */
    boolean isWarningEnabled();
    
    /**
     * 发布错误等级的日志
     *
     * @param message 日志
     * @throws NullPointerException message 为 null
     */
    void error(String message);
    
    /**
     * 发布错误等级的日志
     *
     * @param format    日志
     * @param arguments 日志参数
     * @throws NullPointerException format 为 null
     * @throws NullPointerException arguments 为 null
     */
    void error(String format, Object... arguments);
    
    /**
     * 发布错误等级的日志
     *
     * @param format   日志
     * @param argument 日志参数
     * @throws NullPointerException format 为 null
     * @throws NullPointerException argument 为 null
     */
    void error(String format, Object argument);
    
    /**
     * 发布错误等级的日志
     *
     * @param message 日志
     * @param cause   异常
     * @throws NullPointerException message 为 null
     * @throws NullPointerException cause 为 null
     */
    void error(String message, Throwable cause);
    
    /**
     * 发布错误等级的日志
     *
     * @param cause 异常
     * @throws NullPointerException cause 为 null
     */
    void error(Throwable cause);
    
    /**
     * 询问是否启动错误等级
     *
     * @return 是否启动错误等级
     */
    boolean isErrorEnabled();
    
    /**
     * 发布致命等级的日志
     *
     * @param message 日志
     * @throws NullPointerException message 为 null
     */
    void fatal(String message);
    
    /**
     * 发布致命等级的日志
     *
     * @param format    日志
     * @param arguments 日志参数
     * @throws NullPointerException format 为 null
     * @throws NullPointerException arguments 为 null
     */
    void fatal(String format, Object... arguments);
    
    /**
     * 发布致命等级的日志
     *
     * @param format   日志
     * @param argument 日志参数
     * @throws NullPointerException format 为 null
     * @throws NullPointerException argument 为 null
     */
    void fatal(String format, Object argument);
    
    /**
     * 发布致命等级的日志
     *
     * @param message 日志
     * @param cause   异常
     * @throws NullPointerException message 为 null
     * @throws NullPointerException cause 为 null
     */
    void fatal(String message, Throwable cause);
    
    /**
     * 发布致命等级的日志
     *
     * @param cause 异常
     * @throws NullPointerException cause 为 null
     */
    void fatal(Throwable cause);
    
    /**
     * 询问是否启动致命等级
     *
     * @return 是否启动致命等级
     */
    boolean isFatalEnabled();
    
    /**
     * 询问是否记录日志等级
     *
     * @param level 日志等级
     * @return 是否记录日志等级
     * @throws NullPointerException level 为 null
     */
    boolean isEnableForLevel(LoggerLevel level);
    
    /**
     * 获取日志记录器名
     *
     * @return 日志记录器名
     */
    String getName();
}