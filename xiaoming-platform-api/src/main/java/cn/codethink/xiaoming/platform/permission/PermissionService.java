package cn.codethink.xiaoming.platform.permission;

import cn.codethink.xiaoming.platform.command.sender.CommandSender;

/**
 * <h1>权限服务</h1>
 *
 * <p>用于检查用户是否有权限</p>
 *
 * @author Chuanwise
 */
public interface PermissionService {
    
    // TODO: 2022/9/25 finish javadoc
    Accessibility checkAccessibility(CommandSender commandSender, String permission);
}
