package com.ocp24_exectuor;

public class LottoMain {
    public static void main(String[] args) {
        LottoExecutor exec = new LottoExecutor();
        exec.execute(new Lotto());
        exec.execute(new Lotto());
        exec.execute(new Lotto());
    }
    
}
