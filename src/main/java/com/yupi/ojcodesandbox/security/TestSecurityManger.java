package com.yupi.ojcodesandbox.security;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class TestSecurityManger {
    public static void main(String[] args) {
        System.setSecurityManager(new MySecurityManager());

//        List<String> strings = FileUtil.readLines("D:\\xingqiu-projects\\oj-code-sandbox\\src\\main\\resources\\application.yml", StandardCharsets.UTF_8);
        FileUtil.writeString("aa", "aaa", Charset.defaultCharset());
    }
}
