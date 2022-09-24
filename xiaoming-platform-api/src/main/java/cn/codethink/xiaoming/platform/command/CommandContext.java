package cn.codethink.xiaoming.platform.command;

import cn.codethink.xiaoming.platform.annotations.PlatformTemporaryAPI;
import cn.codethink.xiaoming.platform.command.sender.CommandSender;

/**
 * <h1>指令上下文</h1>
 *
 * <p>用于</p>
 *
 * @author Chuanwise
 */
@PlatformTemporaryAPI
public interface CommandContext
    extends PlatformObject {
    
    /**
     * 获取指令发送方
     *
     * @return 指令发送方
     */
    CommandSender getCommandSender();
}
