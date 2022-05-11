package com.itheima02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> c = Class.forName("com.itheima01.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        System.out.println(obj);

        Field result = c.getDeclaredField("name");
        result.setAccessible(true);
        result.set(obj,"林青霞");
        System.out.println(obj);

        Field ageFiled = c.getDeclaredField("age");
        ageFiled.setAccessible(true);
        ageFiled.set(obj,26);
        System.out.println(obj);

        Field addressFiled = c.getDeclaredField("address");
        addressFiled.setAccessible(true);
        addressFiled.set(obj,"苏州");
        System.out.println(obj);
    }
}
