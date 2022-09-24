package cn.codethink.xiaoming.platform.command.handler;

import cn.codethink.common.util.Preconditions;
import cn.codethink.xiaoming.platform.command.completion.CommandCompletionContext;
import cn.codethink.xiaoming.platform.command.execution.CommandExecutionContext;

public class AnnotatedCommandHandlerImpl
    implements CommandHandler {
    
    private final Object invokeSubject;
    
    public AnnotatedCommandHandlerImpl(Object invokeSubject) {
        Preconditions.objectNonNull(invokeSubject, "invoke subject");
        
        this.invokeSubject = invokeSubject;
    }
    
    @Override
    public void complete(CommandCompletionContext context) throws Exception {
        Preconditions.objectNonNull(context, "context");
    
        // TODO: 2022/9/25 finish functions
    }
    
    @Override
    public void execute(CommandExecutionContext context) throws Exception {
        Preconditions.objectNonNull(context, "context");
    
    }
}
