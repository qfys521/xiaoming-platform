package cn.codethink.xiaoming.platform.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * <h1>平台暂时 API</h1>
 *
 * <p>用于标注小明暂时的对象，这些对象通常只在短期生效，应该在得到这些对象时
 * 立即执行相关操作，而不应该将它们长期保存，否则后续操作它们可能得到异常或产
 * 生预期之外的结果。</p>
 *
 * <p><ul>
 *     <li>注解在类上时，表明该类及其所有子类是平台暂时 API。</li>
 *     <li>注解在接口上时，表明该接口及其所有实现类都是平台暂时 API。</li>
 * </ul></p>
 *
 * @author Chuanwise
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface PlatformTemporaryAPI {
}
