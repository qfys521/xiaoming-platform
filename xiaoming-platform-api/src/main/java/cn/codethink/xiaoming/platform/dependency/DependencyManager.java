package cn.codethink.xiaoming.platform.dependency;

import cn.codethink.xiaoming.platform.command.PlatformObject;
import cn.codethink.xiaoming.platform.common.Registration;

import java.util.NoSuchElementException;

/**
 * <h1>依赖管理器</h1>
 *
 * <p>管理由小明内核或插件所需的依赖</p>
 *
 * @author Chuanwise
 */
public interface DependencyManager
    extends PlatformObject {
    
    /**
     * 获取依赖处理器注册项
     *
     * @param name 依赖处理器名
     * @return 依赖处理器注册项，或 null
     * @throws NullPointerException     name 为 null
     * @throws IllegalArgumentException name 为空串
     */
    Registration<DependencyHandler> getDependencyHandlerRegistration(String name);
    
    /**
     * 获取依赖处理器注册项
     *
     * @param name 依赖处理器名
     * @return 依赖处理器注册项
     * @throws NullPointerException     name 为 null
     * @throws IllegalArgumentException name 为空串
     * @throws NoSuchElementException   没有找到该依赖处理器
     */
    Registration<DependencyHandler> getDependencyHandlerRegistrationOrFail(String name);
    
    /**
     * 获取依赖处理器
     *
     * @param type 依赖处理器名
     * @return 依赖处理器，或 null
     * @throws NullPointerException     name 为 null
     * @throws IllegalArgumentException name 为空串
     */
    DependencyHandler getDependencyHandler(String type);
    
    /**
     * 获取依赖处理器
     *
     * @param type 依赖处理器名
     * @return 依赖处理器
     * @throws NullPointerException     name 为 null
     * @throws IllegalArgumentException name 为空串
     * @throws NoSuchElementException   没有找到该依赖处理器
     */
    DependencyHandler getDependencyHandlerOrFail(String type);
}