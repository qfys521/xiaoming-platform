package cn.codethink.xiaoming.platform.dependency;

/**
 * <h1>依赖处理器</h1>
 *
 * <p>处理某种类型的依赖，如 Maven Jar、Gradle Jar 和 C++ SO 或 Dll 等。</p>
 *
 * @author Chuanwise
 */
public interface DependencyHandler {
    
    /**
     * 获取可处理的依赖名
     *
     * @return 可处理的依赖名
     */
    String getName();
}
