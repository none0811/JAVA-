package com.itheima03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.itheima01.Student");

        //getMethods()
        //getDeclaredMethods()
//        Method[] m = c.getMethods();
        Method[] m = c.getDeclaredMethods();
        for (Method method : m){
            System.out.println(method);
        }
        System.out.println("--------");
        //getMethod()
        //getDeclaredMethod()

        Method m1 = c.getMethod("method1");

        //获取无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();

        m1.invoke(obj);



    }
}
