package com.ocp24_exectuor;

import java.util.concurrent.Executor;

public class LottoExecutor implements Executor{

    @Override
    public void execute(Runnable command) {
           Thread t =  new Thread(command);
            t.start();
    }
    
}
