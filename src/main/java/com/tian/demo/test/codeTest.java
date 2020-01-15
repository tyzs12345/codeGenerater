package com.tian.demo.test;


import com.tian.demo.util.CodeGeneraterUtil;

public class codeTest {

    public static void main(String[] args)throws Exception {

        CodeGeneraterUtil codeGeneraterUtil = new CodeGeneraterUtil();
        codeGeneraterUtil.codeGenerater("com.lanyu", "t_generater_field","test1","t_");

    }
}
