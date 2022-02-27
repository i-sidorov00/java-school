package com.sidorov.igor.datesToCronConverter;

import com.sidorov.igor.util.Constants;

import java.util.List;

public class DatesToCronConverterImpl implements DatesToCronConverter, Constants {

    @Override
    public String convert(List<String> list) {
    // У меня была идея, чтобы реализовать этот метод необходимо каждую дату из списка разбивать на месяца,дни,часы, минуты, секунды
    //Добавлять это в массив и отдельно сравнивать кажыдй параметр, для определения зависимости и получения cron
    //Но я не смог это реализовать, я хочу поступить в школу, чтобы овладеть навыками и в прололжить стажироваться и рабоать в Digital Design
        return null;
    }

    @Override
    public String getImplementationInfo() {
        String info = String.join(",",Constants.FIO,Constants.NAME_CLASS,Constants.NAME_PACKAGE,Constants.LINK_GITHUB);
        System.out.println("ФИО: " + Constants.FIO + "\n Имя класса: "+ Constants.NAME_CLASS + "\n Пакет: " + Constants.NAME_PACKAGE + "\n Ссылка на github: " +Constants.LINK_GITHUB);
        return info;
    }


}

