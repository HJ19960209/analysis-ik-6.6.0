package org.wltea.analyzer.dic;

import org.apache.logging.log4j.Logger;
import org.wltea.analyzer.dic.Dictionary;
import org.wltea.analyzer.help.ESPluginLoggerFactory;

/**
 * @author HJ
 * @create 2021年1月25日 16点45分
 */
public class HotDictReloadThread implements Runnable {

    private static final Logger logger = ESPluginLoggerFactory.getLogger(HotDictReloadThread.class.getName());

    @Override
    public void run() {
        while(true) {
            logger.info("[==========]reload hot dict from mysql......");
            Dictionary.getSingleton().reLoadMainDict();
        }
    }

}

