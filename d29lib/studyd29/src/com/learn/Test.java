package com.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    public static final Logger LOGGER = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            LOGGER.info("这是一个info信息");
            LOGGER.debug("这是一个debug信息");
            LOGGER.error("这是一条error信息");
        }
    }
}
