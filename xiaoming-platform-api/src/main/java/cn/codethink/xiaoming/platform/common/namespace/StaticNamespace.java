package cn.codethink.xiaoming.platform.common.namespace;

import java.util.List;

/**
 * <h1>静态命名空间</h1>
 *
 * <p>指文本解析获得的命名空间，如 {@code cn.codethink.xiaoming}，尚未被组织到命名空间树上。</p>
 *
 * @author Chuanwise
 */
public interface StaticNamespace {
    
    /**
     * 获取命名空间每一段名称
     *
     * @return 命名空间每一段名称
     */
    List<String> getPathSegments();
}
