package com.sidorov.igor;

import com.sidorov.igor.util.Constants;
import com.sidorov.igor.datesToCronConverter.DatesToCronConverterImpl;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Main implements Constants {

    public static void main(String[] args) {

        DatesToCronConverterImpl rel = new DatesToCronConverterImpl();
        System.out.println(rel.getImplementationInfo());

        SimpleDateFormat form = new SimpleDateFormat(DATE_FORMAT);

        Date date = new Date();

        System.out.println(form.format(date));




    }
}