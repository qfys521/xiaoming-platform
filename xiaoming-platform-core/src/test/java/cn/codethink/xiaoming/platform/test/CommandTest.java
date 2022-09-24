package cn.codethink.xiaoming.platform.test;

import cn.codethink.xiaoming.platform.Platform;
import cn.codethink.xiaoming.platform.annotations.Command;
import cn.codethink.xiaoming.platform.annotations.Parameter;
import cn.codethink.xiaoming.platform.annotations.Permission;
import cn.codethink.xiaoming.platform.command.sender.CommandSender;
import cn.codethink.xiaoming.platform.plugin.Plugin;

public class CommandTest {
    
    private static class Commands {
        
        @Command("plugin disable <plugin>")
        @Permission("xiaoming.plugin.disable")
        void disablePlugin(CommandSender     sender,
                           @Parameter Plugin plugin) {
            // disable plugin
            final Platform platform = sender.getPlatform();
        }
    }
}
