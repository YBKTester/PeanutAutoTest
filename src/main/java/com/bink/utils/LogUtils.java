package com.bink.utils;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * @author yangbingkun
 * @Package com.bink.utils
 * @date 2020/9/17 --5:22 下午
 */
public class LogUtils {


    public static Logger getLogger() {
        Logger logger = Logger.getLogger("测试日志");
        PropertyConfigurator.configure("log4j.properties");
        logger.setLevel(Level.DEBUG);
        logger.info(">>>>>>>>>>>>>>日志配置完成<<<<<<<<<<<<<<");
        return logger;
    }
}
