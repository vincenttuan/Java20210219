package com.ocp.day31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// invokeAny demo
public class LottoMachineMain2 {
    public static void main(String[] args) throws Exception {
        System.out.println("準備開獎");
        ExecutorService service = Executors.newCachedThreadPool();
        Collection<Callable<Lotto>> list = new ArrayList<>();
        list.add(new LottoMachine(1));
        list.add(new LottoMachine(2));
        list.add(new LottoMachine(3));
        list.add(new LottoMachine(4));
        list.add(new LottoMachine(5));
        System.out.println("開始搖獎");
        Lotto result = service.invokeAny(list); // 只得到最快搖出獎的 Lotto
        System.out.println("唱名獎號");
        System.out.println(result);
        service.shutdown();
    }
}
