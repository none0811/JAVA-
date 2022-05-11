package com.itheima_ITEM;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
*
* 通过反射往集合里面添加字符串
* */
public class ReflectDemo_item {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

//        arrayList.add(10);
//        arrayList.add(20);

        Class<? extends ArrayList> c = arrayList.getClass();
        Method m = c.getMethod("add", Object.class);

        m.invoke(arrayList,"hello");
        m.invoke(arrayList,"word");
        m.invoke(arrayList,"java");


        System.out.println(arrayList);
    }
}
