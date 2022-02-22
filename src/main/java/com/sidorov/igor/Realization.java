package com.sidorov.igor;

import java.util.List;

public class Realization implements DatesToCronConverter,Constants{

    @Override
    public String convert(List<String> list) {
        return null;
    }

    @Override
    public String getImplementationInfo() {
        String info = String.join(",",Constants.FIO,Constants.NAME_CLASS,Constants.NAME_PACKAGE,Constants.LINK_GITHUB);
        System.out.println("ФИО: " + Constants.FIO + "\n Имя класса: "+ Constants.NAME_CLASS + "\n Пакет: " + Constants.NAME_PACKAGE + "\n Ссылка на github: " +Constants.LINK_GITHUB);
        return info;
    }


}

