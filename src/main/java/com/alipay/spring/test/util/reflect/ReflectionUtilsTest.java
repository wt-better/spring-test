package com.alipay.spring.test.util.reflect;

import java.lang.reflect.Field;

import org.springframework.util.ReflectionUtils;

/**
 * @author yi.xia
 * @date Create At 2020/10/17
 * @link <a href=mailto:yixia.wt@alibaba-inc.com></a>
 */
public class ReflectionUtilsTest {

    public static void setFiled(Field filed, Object obj, Object value) throws IllegalAccessException {
        filed.setAccessible(true);
        filed.set(obj, value);
    }

    private static void setFiledByJDK(Field filed, Object obj, Object value) throws IllegalAccessException {
        setFiled(filed, obj, value);

        print(filed.get(obj));
    }

    private static void setFiledBySpring(Field filed, Object obj, Object value) throws IllegalAccessException {
        filed.setAccessible(true);

        ReflectionUtils.setField(filed, obj, value);

        print(filed.get(obj));
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        User user = new User();
        user.setId("1");

        Class<? extends User> userClass = user.getClass();
        //field如果为非public，getField将会抛出异常java.lang.NoSuchFieldException，而getDeclaredField可以获取非public字段
        Field field = userClass.getDeclaredField("id");
        //如果类型不匹配，将会抛出java.lang.IllegalArgumentException
        setFiledByJDK(field, user, 2);
        //obj为null，将会抛出java.lang.NullPointerException
        setFiledByJDK(field,null,"2");
        //spring的ReflectionUtils只是包了一层Jdk的field set
        setFiledBySpring(field, null, "2");
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
