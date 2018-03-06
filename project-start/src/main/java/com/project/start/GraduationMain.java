package com.project.start;

import com.project.start.listener.DashBoardListener;
import com.project.service.VerticleMain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GraduationMain {

    public static void main(String[] args) {
        GraduationMain main = new GraduationMain();
        main.start();
    }

    private void start() {

        DashBoardListener myRunnable1=new DashBoardListener("Runnable-运行进程开始");

        Thread myThread1=new Thread(myRunnable1);

        try {
            myThread1.start();

        } catch (Exception e) {
            log.error("start error",e);
        }

        VerticleMain.deployVertx();

    }

}