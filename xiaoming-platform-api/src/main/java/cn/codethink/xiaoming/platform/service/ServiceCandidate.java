package cn.codethink.xiaoming.platform.service;

/**
 * <h1>服务候选人</h1>
 *
 * @author Chuanwise
 */
public interface ServiceCandidate {
    
    /**
     * 服务被注册上时的操作
     *
     * @param service 服务
     * @throws Exception 操作过程中的异常
     */
    void onRegister(Service<?> service) throws Exception;
    
    /**
     * 服务被选中时的操作
     *
     * @param service 服务
     * @throws Exception 操作过程中的异常
     */
    void onSelected(Service<?> service) throws Exception;
}
