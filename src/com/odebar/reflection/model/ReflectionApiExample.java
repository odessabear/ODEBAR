package com.odebar.reflection.model;

import java.lang.reflect.*;

public class ReflectionApiExample {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        User user = new User(25L, "Ivan", 32);
        testMethods(user);
        //       testFields(user);
//        Class<? extends User> userClass = user.getClass();
//        Class<User> userClass1 = User.class;
//        System.out.println(userClass == userClass1);

//        testConstructor();
    }

    private static void testConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<User> constructor = User.class.getConstructor(Long.class, String.class);
        User peter = constructor.newInstance(5L, "Peter");
        System.out.println(peter);
    }

    private static void testFields(User user) throws IllegalAccessException {
        Field[] declaredFields = User.class.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            System.out.println(declaredField.getModifiers());
            System.out.println(Modifier.isPrivate(declaredField.getModifiers()));
            Object value = declaredField.get(user);
            System.out.println(value);
        }
    }

    private static void testMethods(User user) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = user.getClass().getDeclaredMethod("setName", String.class);
        method.invoke(user, "Sveta");
        System.out.println(user);
    }

    private class Test1 {
    }

    private enum Test2 {
        ONE, TWO
    }

    private static class Test3 {
    }
}
