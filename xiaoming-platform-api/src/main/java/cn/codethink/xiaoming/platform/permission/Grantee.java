package cn.codethink.xiaoming.platform.permission;

/**
 * <h1>权限所有人</h1>
 *
 * <p>可以检查权限情况的对象</p>
 *
 * @author Chuanwise
 */
public interface Grantee {
    
    /**
     * 检查权限所有人是否具备权限
     *
     * @param permission 权限
     * @return 权限所有人是否具备权限
     * @throws NullPointerException permission 为 null
     * @throws IllegalArgumentException permission 为空串
     */
    boolean hasPermission(String permission);
}
