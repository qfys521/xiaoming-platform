package cn.codethink.xiaoming.platform.dependency;

/**
 * <h1>依赖</h1>
 *
 * <p>依赖是小明平台运行过程中必须的组件</p>
 *
 * @author Chuanwise
 */
public interface Dependency {
    
    /**
     * 获取依赖名
     *
     * @return 依赖名
     */
    String getName();
}
