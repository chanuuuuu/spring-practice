package com.spring.practice;

import com.spring.practice.config.Config;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.spring.practice.service.StringSortService;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        // 등록된 Bean을 가져와서 자동으로 주입한다.
        // 하지만 Component가 여러개일 경우에는 문제가 발생한다.
        StringSortService service = context.getBean(StringSortService.class);

        //StringSortService service = new StringSortService(new JavaSort<>());
        // 안의 상태 변수를 변경할 수 있으나,
        //service.setSort(new JavaSort<>());
        List<String> list = service.doSort(Arrays.asList(args));
        System.out.println("hello world " + list.toString());
    }
}
