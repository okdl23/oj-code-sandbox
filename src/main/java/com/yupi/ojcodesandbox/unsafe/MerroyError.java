package com.yupi.ojcodesandbox.unsafe;

import java.util.ArrayList;
import java.util.List;

/**
 * 无限占用空间（浪费系统内存）
 */
public class MerroyError {
    public static void main(String[] args) throws InterruptedException {
        List<byte[]> bytes = new ArrayList<>();
        while (true){
            bytes.add(new byte[10000]);
        }
    }
}
