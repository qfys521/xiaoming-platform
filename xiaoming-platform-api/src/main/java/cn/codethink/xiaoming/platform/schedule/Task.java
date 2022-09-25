package cn.codethink.xiaoming.platform.schedule;

/**
 * <h1>任务</h1>
 *
 * <p>调度的最小单位</p>
 *
 * @author Chuanwise
 */
public interface Task {
    
    /**
     * 判断任务是否为正规任务
     *
     * @return 任务是否为正规任务
     */
    boolean isRegular();
    
    /**
     * 修改任务正规性
     *
     * @return 任务正规性是否发生了改变
     */
    boolean setRegular(boolean regular);
    
    /**
     * 获取任务动作
     *
     * @return 任务动作
     */
    Action getAction();
    
    /**
     * 修改任务动作
     *
     * @param action 任务动作
     * @return 修改前的任务动作
     * @throws NullPointerException action 为 null
     */
    Action setAction(Action action);
}
