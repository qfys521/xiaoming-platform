package cn.codethink.xiaoming.platform.api;

import cn.codethink.common.util.Preconditions;
import cn.codethink.xiaoming.platform.annotations.PlatformInternalAPI;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceLoader;

/**
 * <h1>小明平台 API 工厂</h1>
 *
 * <p>存放小明平台 API 的实例</p>
 *
 * @author Chuanwise
 */
@PlatformInternalAPI
public final class APIFactory {
    private APIFactory() {
        throw new UnsupportedOperationException("can not construct an instance of " + APIFactory.class.getName());
    }
    
    private static volatile API instance;
    
    /**
     * 获取小明平台 API 实例
     *
     * @return 小明平台 API 实例
     * @throws NoSuchElementException 没有小明平台 API 实例
     */
    public static API getInstance() {
        if (instance == null) {
            synchronized (APIFactory.class) {
                if (instance == null) {
                    // load api
                    final ServiceLoader<API> serviceLoader = ServiceLoader.load(API.class);
                    final Iterator<API> iterator = serviceLoader.iterator();
                    
                    if (!iterator.hasNext()) {
                        throw new NoSuchElementException("no xiaoming platform core present!");
                    }
                    instance = iterator.next();
                }
            }
        }
        return instance;
    }
    
    /**
     * 修改小明平台 API 实例
     *
     * @param instance 小明平台 API 实例
     * @return 修改前的小明平台 API 实例
     * @throws NullPointerException instance 为 null
     */
    public static API setInstance(API instance) {
        Preconditions.objectNonNull(instance, "instance");
    
        synchronized (APIFactory.class) {
            final API beforeSet = APIFactory.instance;
            APIFactory.instance = instance;
            return beforeSet;
        }
    }
}
