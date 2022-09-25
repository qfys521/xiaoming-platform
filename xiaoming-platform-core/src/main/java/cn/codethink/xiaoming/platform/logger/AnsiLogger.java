package cn.codethink.xiaoming.platform.logger;

import cn.codethink.common.util.Arguments;
import cn.codethink.common.util.Exceptions;
import cn.codethink.common.util.Preconditions;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class AnsiLogger
    implements Logger {
    
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    /**
     * 日志名
     */
    private final String name;
    
    /**
     * 日志等级
     */
    private final LoggerLevel level;
    
    public AnsiLogger(String name, LoggerLevel level) {
        Preconditions.objectNonEmpty(name, "name");
        Preconditions.objectNonNull(level, "level");
        
        this.name = name;
        this.level = level;
    }
    
    private void trace0(String message) {
        AnsiConsole.out().println(
            Ansi.ansi()
        
                // 2022-09-25 19:18:20
                .fgBrightBlack()
                .a(DATE_FORMAT.format(System.currentTimeMillis()))
                .reset()
        
                .a(" ")
        
                // name
                .fgBrightBlack()
                .a(name)
                .reset()
        
                // |
                .fgBrightBlack()
                .a(" | ")
                .reset()
        
                // LEVEL
                .fgBrightBlack()
                .a("TRACE")
                .reset()
        
                // |
                .fgBrightBlack()
                .a(" : ")
                .reset()
        
                // message
                .fgBrightBlack()
                .a(message)
                .reset()
        );
    }
    
    @Override
    public void trace(String message) {
        if (isEnableForLevel(LoggerLevel.TRACE)) {
            trace0(message);
        }
    }
    
    @Override
    public void trace(String format, Object... arguments) {
        if (isEnableForLevel(LoggerLevel.TRACE)) {
            trace0(Arguments.format(format, arguments));
        }
    }
    
    @Override
    public void trace(String format, Object argument) {
        if (isEnableForLevel(LoggerLevel.TRACE)) {
            trace0(Arguments.format(format, argument));
        }
    }
    
    @Override
    public void trace(String message, Throwable cause) {
        if (isEnableForLevel(LoggerLevel.TRACE)) {
            trace0(message + "\n" + Exceptions.readStackTrace(cause));
        }
    }
    
    @Override
    public void trace(Throwable cause) {
        if (isEnableForLevel(LoggerLevel.TRACE)) {
            trace0(Exceptions.readStackTrace(cause));
        }
    }
    
    @Override
    public boolean isTraceEnabled() {
        return level.compareTo(LoggerLevel.TRACE) <= 0;
    }
    
    private void debug0(String message) {
        AnsiConsole.out().println(
            Ansi.ansi()
                
                // 2022-09-25 19:18:20
                .fgBrightBlack()
                .a(DATE_FORMAT.format(System.currentTimeMillis()))
                .reset()
                
                .a(" ")
                
                // name
                .fgBlue()
                .a(name)
                .reset()
                
                // |
                .fgBrightBlack()
                .a(" | ")
                .reset()
                
                // LEVEL
                .fgBrightBlue()
                .a("DEBUG")
                .reset()
                
                // |
                .fgBrightBlack()
                .a(" : ")
                .reset()
                
                // message
                .fgBlue()
                .a(message)
                .reset()
        );
    }
    
    @Override
    public void debug(String message) {
        if (isEnableForLevel(LoggerLevel.DEBUG)) {
            debug0(message);
        }
    }
    
    @Override
    public void debug(String format, Object... arguments) {
        if (isEnableForLevel(LoggerLevel.DEBUG)) {
            debug0(Arguments.format(format, arguments));
        }
    }
    
    @Override
    public void debug(String format, Object argument) {
        if (isEnableForLevel(LoggerLevel.DEBUG)) {
            debug0(Arguments.format(format, argument));
        }
    }
    
    @Override
    public void debug(String message, Throwable cause) {
        if (isEnableForLevel(LoggerLevel.DEBUG)) {
            debug0(message + "\n" + Exceptions.readStackTrace(cause));
        }
    }
    
    @Override
    public void debug(Throwable cause) {
        if (isEnableForLevel(LoggerLevel.DEBUG)) {
            debug0(Exceptions.readStackTrace(cause));
        }
    }
    
    @Override
    public boolean isDebugEnabled() {
        return level.compareTo(LoggerLevel.DEBUG) <= 0;
    }
    
    private void info0(String message) {
        AnsiConsole.out().println(
            Ansi.ansi()
                
                // 2022-09-25 19:18:20
                .fgBrightBlack()
                .a(DATE_FORMAT.format(System.currentTimeMillis()))
                .reset()
                
                .a(" ")
                
                // name
                .fg(Ansi.Color.WHITE)
                .a(name)
                .reset()
                
                // |
                .fgBrightBlack()
                .a(" | ")
                .reset()
                
                // LEVEL
                .fgBrightCyan()
                .a("INFO")
                .reset()
                
                // |
                .fgBrightBlack()
                .a(" : ")
                .reset()
                
                // message
                .fg(Ansi.Color.WHITE)
                .a(message)
                .reset()
        );
    }
    
    @Override
    public void info(String message) {
        if (isEnableForLevel(LoggerLevel.INFO)) {
            info0(message);
        }
    }
    
    @Override
    public void info(String format, Object... arguments) {
        if (isEnableForLevel(LoggerLevel.INFO)) {
            info0(Arguments.format(format, arguments));
        }
    }
    
    @Override
    public void info(String format, Object argument) {
        if (isEnableForLevel(LoggerLevel.INFO)) {
            info0(Arguments.format(format, argument));
        }
    }
    
    @Override
    public void info(String message, Throwable cause) {
        if (isEnableForLevel(LoggerLevel.INFO)) {
            info0(message + "\n" + Exceptions.readStackTrace(cause));
        }
    }
    
    @Override
    public void info(Throwable cause) {
        if (isEnableForLevel(LoggerLevel.INFO)) {
            info0(Exceptions.readStackTrace(cause));
        }
    }
    
    @Override
    public boolean isInfoEnabled() {
        return level.compareTo(LoggerLevel.INFO) <= 0;
    }
    
    private void success0(String message) {
        AnsiConsole.out().println(
            Ansi.ansi()
                
                // 2022-09-25 19:18:20
                .fgBrightBlack()
                .a(DATE_FORMAT.format(System.currentTimeMillis()))
                .reset()
                
                .a(" ")
                
                // name
                .fgGreen()
                .a(name)
                .reset()
                
                // |
                .fgBrightBlack()
                .a(" | ")
                .reset()
                
                // LEVEL
                .fgBrightGreen()
                .a("SUCCESS")
                .reset()
                
                // |
                .fgBrightBlack()
                .a(" : ")
                .reset()
                
                // message
                .fgGreen()
                .a(message)
                .reset()
        );
    }
    
    @Override
    public void success(String message) {
        if (isEnableForLevel(LoggerLevel.SUCCESS)) {
            success0(message);
        }
    }
    
    @Override
    public void success(String format, Object... arguments) {
        if (isEnableForLevel(LoggerLevel.SUCCESS)) {
            success0(Arguments.format(format, arguments));
        }
    }
    
    @Override
    public void success(String format, Object argument) {
        if (isEnableForLevel(LoggerLevel.SUCCESS)) {
            success0(Arguments.format(format, argument));
        }
    }
    
    @Override
    public void success(String message, Throwable cause) {
        if (isEnableForLevel(LoggerLevel.SUCCESS)) {
            success0(message + "\n" + Exceptions.readStackTrace(cause));
        }
    }
    
    @Override
    public void success(Throwable cause) {
        if (isEnableForLevel(LoggerLevel.SUCCESS)) {
            success0(Exceptions.readStackTrace(cause));
        }
    }
    
    @Override
    public boolean isSuccessEnabled() {
        return level.compareTo(LoggerLevel.SUCCESS) <= 0;
    }
    
    private void warning0(String message) {
        AnsiConsole.out().println(
            Ansi.ansi()
                
                // 2022-09-25 19:18:20
                .fgBrightBlack()
                .a(DATE_FORMAT.format(System.currentTimeMillis()))
                .reset()
                
                .a(" ")
                
                // name
                .fgYellow()
                .a(name)
                .reset()
                
                // |
                .fgBrightBlack()
                .a(" | ")
                .reset()
                
                // LEVEL
                .fgBrightYellow()
                .a("WARNING")
                .reset()
                
                // |
                .fgBrightBlack()
                .a(" : ")
                .reset()
                
                // message
                .fgYellow()
                .a(message)
                .reset()
        );
    }
    
    @Override
    public void warning(String message) {
        if (isEnableForLevel(LoggerLevel.WARNING)) {
            warning0(message);
        }
    }
    
    @Override
    public void warning(String format, Object... arguments) {
        if (isEnableForLevel(LoggerLevel.WARNING)) {
            warning0(Arguments.format(format, arguments));
        }
    }
    
    @Override
    public void warning(String format, Object argument) {
        if (isEnableForLevel(LoggerLevel.WARNING)) {
            warning0(Arguments.format(format, argument));
        }
    }
    
    @Override
    public void warning(String message, Throwable cause) {
        if (isEnableForLevel(LoggerLevel.WARNING)) {
            warning0(message + "\n" + Exceptions.readStackTrace(cause));
        }
    }
    
    @Override
    public void warning(Throwable cause) {
        if (isEnableForLevel(LoggerLevel.WARNING)) {
            warning0(Exceptions.readStackTrace(cause));
        }
    }
    
    @Override
    public boolean isWarningEnabled() {
        return level.compareTo(LoggerLevel.WARNING) <= 0;
    }
    
    private void error0(String message) {
        AnsiConsole.out().println(
            Ansi.ansi()
                
                // 2022-09-25 19:18:20
                .fgBrightBlack()
                .a(DATE_FORMAT.format(System.currentTimeMillis()))
                .reset()
                
                .a(" ")
                
                // name
                .fgRed()
                .a(name)
                .reset()
                
                // |
                .fgBrightBlack()
                .a(" | ")
                .reset()
                
                // LEVEL
                .fgBrightRed()
                .a("ERROR")
                .reset()
                
                // |
                .fgBrightBlack()
                .a(" : ")
                .reset()
                
                // message
                .fgRed()
                .a(message)
                .reset()
        );
    }
    
    @Override
    public void error(String message) {
        if (isEnableForLevel(LoggerLevel.ERROR)) {
            error0(message);
        }
    }
    
    @Override
    public void error(String format, Object... arguments) {
        if (isEnableForLevel(LoggerLevel.ERROR)) {
            error0(Arguments.format(format, arguments));
        }
    }
    
    @Override
    public void error(String format, Object argument) {
        if (isEnableForLevel(LoggerLevel.ERROR)) {
            error0(Arguments.format(format, argument));
        }
    }
    
    @Override
    public void error(String message, Throwable cause) {
        if (isEnableForLevel(LoggerLevel.ERROR)) {
            error0(message + "\n" + Exceptions.readStackTrace(cause));
        }
    }
    
    @Override
    public void error(Throwable cause) {
        if (isEnableForLevel(LoggerLevel.ERROR)) {
            error0(Exceptions.readStackTrace(cause));
        }
    }
    
    @Override
    public boolean isErrorEnabled() {
        return level.compareTo(LoggerLevel.ERROR) <= 0;
    }
    
    private void fatal0(String message) {
        AnsiConsole.out().println(
            Ansi.ansi()
                
                // 2022-09-25 19:18:20
                .fgBrightBlack()
                .bgRed()
                .a(DATE_FORMAT.format(System.currentTimeMillis()))
                
                .a(" ")
                
                // name
                .fg(Ansi.Color.WHITE)
                .bgRed()
                .a(name)
                
                // |
                .fgBrightBlack()
                .a(" | ")
                
                // LEVEL
                .fgBrightYellow()
                .bgBrightRed()
                .a("FATAL")
                .bgRed()
                
                // |
                .fgBrightBlack()
                .a(" : ")
                
                // message
                .fg(Ansi.Color.WHITE)
                .bgRed()
                .a(message)
                .reset()
        );
    }
    
    @Override
    public void fatal(String message) {
        if (isEnableForLevel(LoggerLevel.FATAL)) {
            fatal0(message);
        }
    }
    
    @Override
    public void fatal(String format, Object... arguments) {
        if (isEnableForLevel(LoggerLevel.FATAL)) {
            fatal0(Arguments.format(format, arguments));
        }
    }
    
    @Override
    public void fatal(String format, Object argument) {
        if (isEnableForLevel(LoggerLevel.FATAL)) {
            fatal0(Arguments.format(format, argument));
        }
    }
    
    @Override
    public void fatal(String message, Throwable cause) {
        if (isEnableForLevel(LoggerLevel.FATAL)) {
            fatal0(message + "\n" + Exceptions.readStackTrace(cause));
        }
    }
    
    @Override
    public void fatal(Throwable cause) {
        if (isEnableForLevel(LoggerLevel.FATAL)) {
            fatal0(Exceptions.readStackTrace(cause));
        }
    }
    
    @Override
    public boolean isFatalEnabled() {
        return level.compareTo(LoggerLevel.FATAL) <= 0;
    }
    
    @Override
    public boolean isEnableForLevel(LoggerLevel level) {
        Preconditions.objectNonNull(level, "level");
        
        return this.level.compareTo(level) <= 0;
    }
    
    @Override
    public String getName() {
        return name;
    }
}
