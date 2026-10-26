package org.example.task4;

import org.example.model.MetricsCollector;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Task4 {

    public static void main(String[] args) {
        MetricsCollector mock = (MetricsCollector) Proxy.newProxyInstance(
                MetricsCollector.class.getClassLoader(),   // загрузчик классов
                new Class<?>[]{MetricsCollector.class},  // реализуемые интерфейсы
                new InvocationHandler() {                  // обработчик вызовов
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args)
                            throws Throwable {
                        return null;
                    }
                });

        mock.increment("requests");   // → "increment → 12 ms"
        System.out.println(mock.toString());
    }
}
