package cn.codethink.xiaoming.platform.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <h1>平台内部 API</h1>
 *
 * <p>用于标注小明底层的 API。这些 API 可能在没有任何事先警告的前提下改动，因此不建议
 * 在你的代码中调用这些 API。</p>
 *
 * <p><ul>
 *     <li>注解在类上时，表明该类及其所有成员都是平台内部 API。</li>
 *     <li>注解在方法上时，表明该方法是平台内部 API。</li>
 *     <li>注解在接口上时，表明该接口及其所有实现类都是平台内部 API。</li>
 * </ul></p>
 *
 * @author Chuanwise
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.SOURCE)
public @interface PlatformInternalAPI {
}
