package cn.codethink.xiaoming.platform.common;

import cn.codethink.common.util.Preconditions;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RegistrationImpl<T>
    implements Registration<T> {
    
    private final Lock valueLock = new ReentrantLock();
    private T value;
    
    private final Subject subject;
    
    public RegistrationImpl(T value, Subject subject) {
        Preconditions.objectNonNull(value, "value");
        Preconditions.objectNonNull(subject, "subject");
        
        this.value = value;
        this.subject = subject;
    }
    
    @Override
    public T getValue() {
        return value;
    }
    
    @Override
    public T setValue(T value) {
        Preconditions.objectNonNull(value, "value");
    
        try {
            valueLock.lock();
            
            final T beforeSet = this.value;
            this.value = value;
            return beforeSet;
        } finally {
            valueLock.unlock();
        }
    }
    
    @Override
    public Subject getSubject() {
        return subject;
    }
}
