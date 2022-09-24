package cn.codethink.xiaoming.platform.terminal;

import cn.codethink.xiaoming.platform.command.PlatformObject;
import cn.codethink.xiaoming.platform.command.sender.CommandSender;

/**
 * <h1>终端管理器</h1>
 *
 * <p>管理小明的终端</p>
 *
 * @author Chuanwise
 */
public interface TerminalManager
    extends PlatformObject {
    
    /**
     * 获取向所有终端收发消息的指令发送方
     *
     * @return 指令发送方
     */
    CommandSender getCommandSender();
}
