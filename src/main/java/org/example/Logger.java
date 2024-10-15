package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    //переменная счётчика сообщений
    protected int num = 1;
    // В этом поле храним ссылку на тот
    // единственный объект этого класса
    // который будем отдавать пользователям
    private static Logger logger;

    // Запрещаем пользователям пользоваться
    // конструктором нашего класса
    private Logger() {
    }

    // Пользователи которым нужен объект
    // нашего класса получают всегда один
    // и тот же объект, который мы храним
    // в приватном статичном поле, которое
    // мы заполняем в этом методе если оно
    // до того не было заполнено
    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }

    //метод записиси лога - в данном случае запись ведётся в консоль
    public void log(String msg) {
        //Создаём экземпляр класса дата
        Date dateNow = new Date();
        //форматируем
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        //выводим сообщение с датой, временем и номером записи в консоль
        System.out.println("[" + formatForDateNow.format(dateNow) + " " + num++ + "] " + msg);
    }
}
