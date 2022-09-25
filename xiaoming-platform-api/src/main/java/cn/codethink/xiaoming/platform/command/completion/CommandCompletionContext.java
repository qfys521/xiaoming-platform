package cn.codethink.xiaoming.platform.command.completion;

import cn.codethink.xiaoming.platform.command.CommandContext;

import java.util.List;

/**
 * <h1>指令补全环境</h1>
 *
 * <p>表示一次指令补全动作。</p>
 *
 * @author Chuanwise
 */
public interface CommandCompletionContext
    extends CommandContext {
    
    /**
     * 获取整行
     *
     * @return 整行
     */
    String getLine();
    
    /**
     * 获取光标位置
     *
     * @return 光标位置
     */
    int getCursor();
    
    /**
     * 获取单词
     *
     * @return 单词
     */
    List<String> getWords();
    
    /**
     * 获取光标所在的单词
     *
     * @return 光标所在的单词，或返回空串表示无单词
     */
    String getWordInCursor();
    
    /**
     * 判断光标是否在一个单词中
     *
     * @return 光标是否在一个单词中
     */
    boolean isCursorInWord();
    
    /**
     * 获取候选项
     *
     * @return 候选项
     */
    List<String> getCandidates();
}
