package cn.codethink.xiaoming.platform.logger;

/**
 * <h1>日志等级</h1>
 *
 * <p>用于区分日志的轻重缓急</p>
 *
 * @author Chuanwise
 */
public enum LoggerLevel {
    
    /**
     * 轨迹
     */
    TRACE,
    
    /**
     * 调试
     */
    DEBUG,
    
    /**
     * 标准
     */
    INFO,
    
    /**
     * 成功
     */
    SUCCESS,
    
    /**
     * 警告
     */
    WARNING,
    
    /**
     * 错误
     */
    ERROR,
    
    /**
     * 致命
     */
    FATAL,
}
