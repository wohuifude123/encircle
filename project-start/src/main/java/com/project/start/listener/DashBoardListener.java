package com.project.start.listener;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DashBoardListener implements Runnable {
    private String name;

    public DashBoardListener(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        log.info("MyRunnable is " + name);
    }
}
