package com.itheima_ITEM02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectDemo_item02 {
    public static void main(String[] args) throws ClassNotFoundException, IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
//        Student s = new Student();
//        s.study();

//        Teacher  t = new Teacher();
//        t.teach();

        /*
        *
        * 通过配置文件使用反射
        * */
        //加载数据
        Properties prop = new Properties();
        FileReader fr = new FileReader("src\\class.txt");
        prop.load(fr);
        fr.close();

        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        //通过反射使用
        Class<?> c = Class.forName(className);

        //创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();


        Method m = c.getMethod(methodName);
        m.invoke(obj);

    }
}
