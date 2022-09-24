package cn.codethink.xiaoming.platform.command.handler;

import cn.codethink.common.util.Exceptions;

/**
 * <h1>指令处理器工厂</h1>
 *
 * @author Chuanwise
 */
public final class CommandHandlerFactory {
    private CommandHandlerFactory() {
        Exceptions.throwUtilClassInitializeException(CommandHandlerFactory.class);
    }
    
    
}
