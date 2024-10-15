package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //получаем экземпляр класса логер
        Logger logger = Logger.getInstance();
        //запись в лог
        logger.log("Запускаем программу");
        //создаём экземпляр класса сканер для ввода данных пользователем
        Scanner scanner = new Scanner(System.in);
        //запись в лог
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.println("Введите размер списка:");
        //сохраняем размер списка
        int size = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        //сохраняем в переменную верхнюю границу чисел списка
        int upper = scanner.nextInt();
        //запись в лог
        logger.log("Создаём и наполняем список");
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(upper));
        }
        System.out.println("Вот случайный список: " + list);
        //запись в лог
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        int treshold = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(treshold);
        List<Integer> filtredList = filter.filterOut(list);
        logger.log("Прошло фильтр " + filtredList.size() + "из " + list.size());
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список " + filtredList);
        logger.log("Завершаем программу");

    }
}