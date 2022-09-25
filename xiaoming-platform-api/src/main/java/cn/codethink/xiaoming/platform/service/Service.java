package cn.codethink.xiaoming.platform.service;

import cn.codethink.xiaoming.platform.common.Priority;

import java.util.Map;

/**
 * <h1>服务</h1>
 *
 * <p>主体可以提供的，供小明平台或其他插件使用的功能</p>
 *
 * @param <T> 服务类型
 * @author Chuanwise
 */
public interface Service<T> {
    
    /**
     * 获取服务类型
     *
     * @return 服务类型
     */
    Class<T> getServiceClass();
}
