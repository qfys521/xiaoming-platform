package cn.codethink.xiaoming.platform.logger;

import cn.codethink.common.util.Arguments;
import cn.codethink.common.util.Preconditions;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;

public class AnsiLogger
    implements Logger {
    
    @Override
    public void trace(String log, Object... arguments) {
        Preconditions.objectNonEmpty(log, "log");
        Preconditions.objectNonNull(arguments, "arguments");
    
        // TODO: 2022/9/25 ansi format
    }
    
    @Override
    public void trace(String log, Throwable exception, Object... arguments) {
    
    }
    
    @Override
    public void debug(String log, Object... arguments) {
    
    }
    
    @Override
    public void debug(String log, Throwable exception, Object... arguments) {
    
    }
    
    @Override
    public void info(String log, Object... arguments) {
    
    }
    
    @Override
    public void info(String log, Throwable exception, Object... arguments) {
    
    }
    
    @Override
    public void success(String log, Object... arguments) {
    
    }
    
    @Override
    public void success(String log, Throwable exception, Object... arguments) {
    
    }
    
    @Override
    public void warning(String log, Object... arguments) {
    
    }
    
    @Override
    public void warning(String log, Throwable exception, Object... arguments) {
    
    }
    
    @Override
    public void error(String log, Object... arguments) {
    
    }
    
    @Override
    public void error(String log, Throwable exception, Object... arguments) {
    
    }
    
    @Override
    public void fatal(String log, Object... arguments) {
    
    }
    
    @Override
    public void fatal(String log, Throwable exception, Object... arguments) {
    
    }
}
