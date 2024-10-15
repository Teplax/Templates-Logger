package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    //граничное значение для фильтрации элементов
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    //метод, возвращающий отфильтрованный список
    public List<Integer> filterOut(List<Integer> source) {
        //получаем экземпляр класса логер
        Logger logger = Logger.getInstance();
        //инициализируем выходной список
        List<Integer> result = new ArrayList<>();
        //пройдёмся циклом по переданному списку
        for (Integer i : source) {
            if (i < treshold) {
                //если элемент ниже граничного значения - выводим соотвествующую запись в лог
                logger.log("Элемент " + (char) 34 + i + (char) 34 + " не проходит");
            } else {
                //если больше -логируем и добавляем элемент в выходной список
                logger.log("Элемент " + (char) 34 + i + (char) 34 + " проходит");
                result.add(i);
            }
        }
        //возвращаем итоговый список
        return result;
    }
}
