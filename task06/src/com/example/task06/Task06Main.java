package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат

        new Task06Main().printMethodName();

    }
    //тесты не проходит
    void printMethodName() {
        Exception ex = new Exception("Message");
        StackTraceElement[] elements = ex.getStackTrace();

        System.out.println(elements[1].getMethodName());
    }

}