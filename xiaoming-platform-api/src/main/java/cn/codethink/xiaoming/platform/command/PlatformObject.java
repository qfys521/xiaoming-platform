package cn.codethink.xiaoming.platform.command;

import cn.codethink.xiaoming.platform.Platform;

/**
 * <h1>平台对象</h1>
 *
 * <p>属于某个平台的对象</p>
 *
 * @author Chuanwise
 */
public interface PlatformObject {
    
    /**
     * 获取对象所属平台
     *
     * @return 对象所属平台
     */
    Platform getPlatform();
}
