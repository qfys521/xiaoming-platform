package cn.codethink.xiaoming.platform.test;

import cn.codethink.xiaoming.platform.logger.AnsiLogger;
import cn.codethink.xiaoming.platform.logger.Logger;
import cn.codethink.xiaoming.platform.logger.LoggerLevel;
import org.junit.jupiter.api.Test;

public class LoggerTest {
    
    @Test
    @SuppressWarnings("all")
    void testFormat() {
        
        final Exception exception = new UnsupportedOperationException();
        final Logger logger = new AnsiLogger("Test", LoggerLevel.TRACE);
        
        logger.trace("trace");
        logger.trace("trace", exception);
        logger.trace(exception);
        logger.trace("trace {}", 1);
        
        logger.debug("debug");
        logger.debug("debug", exception);
        logger.debug(exception);
        logger.debug("debug {}", 1);
        
        logger.info("info");
        logger.info("info", exception);
        logger.info(exception);
        logger.info("info {}", 1);
        
        logger.success("success");
        logger.success("success", exception);
        logger.success(exception);
        logger.success("success {}", 1);
        
        logger.warning("warning");
        logger.warning("warning", exception);
        logger.warning(exception);
        logger.warning("warning {}", 1);
        
        logger.error("error");
        logger.error("error", exception);
        logger.error(exception);
        logger.error("error {}", 1);
        
        logger.fatal("fatal");
        logger.fatal("fatal", exception);
        logger.fatal(exception);
        logger.fatal("fatal {}", 1);
    }
}
