package com.sidorov.igor.datesToCronConverter;

import java.util.List;

public interface DatesToCronConverter {

    String convert (List<String> list);

    String getImplementationInfo();

}
