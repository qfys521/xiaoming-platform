package cn.codethink.xiaoming.platform.terminal;

import cn.codethink.xiaoming.platform.command.sender.CommandSender;
import cn.codethink.xiaoming.platform.logger.Logger;

/**
 * <h1>终端</h1>
 *
 * <p>终端是用于输入输出文字的工具，通常用于输入控制台命令和输出日志信息。
 * 小明平台不会自动注册任何终端，所有的终端都是第三方提供的。</p>
 *
 * @author Chuanwise
 */
public interface Terminal {
    
    /**
     * 获取终端名
     *
     * @return 终端名
     */
    String getName();
    
    /**
     * 获取指令发送方
     *
     * @return 指令发送方
     */
    CommandSender getCommandSender();
    
    /**
     * 获取日志记录器
     *
     * @return 日志记录器
     */
    Logger getLogger();
}
