package cn.codethink.xiaoming.platform.schedule;

import cn.codethink.xiaoming.platform.annotations.PlatformTemporaryAPI;
import cn.codethink.xiaoming.platform.command.PlatformObject;

/**
 * <h1>任务环境</h1>
 *
 * @author Chuanwise
 */
@PlatformTemporaryAPI
public interface TaskContext
    extends PlatformObject {
    
    /**
     * 获取任务结果
     *
     * @return 任务结果
     */
    Object getResult();
    
    /**
     * 修改任务结果
     *
     * @param result 任务结果
     * @return 修改前的任务结果
     */
    Object setResult(Object result);
}
