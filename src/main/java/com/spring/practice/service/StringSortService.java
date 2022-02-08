package com.spring.practice.service;

import java.util.List;
import com.spring.practice.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class StringSortService {

    private Sort<String> sort;

    // new를 사용하여 정렬 로직을 어떤 것을 사용할 것인가에 대한 작업을
    // 외부의 주입을 통해 정의하고, 이 Service는 어떠한 책임도 지지 않는다.
    // - Qualifier를 통해서 여러개 중에서 주입되는 의존성을 정의할 수 있다. -> 생성자 injection일 경우에만
    public StringSortService(@Qualifier("javaSort") Sort<String> sort) {
        System.out.println("선택된 구현체는 : " + sort.getClass().getName());
        this.sort = sort;
    }

    public void setSort(Sort<String> sort) {
        this.sort = sort;
    }

    // 이렇게 doSort만을 사용하도록 하여 내부 코드를 보지 않으면 어떠한 로직으로 정렬하는지를 모른다.
    // 이렇게 감춰둔다.
    public List<String> doSort(List<String> input){
        return sort.sort(input);
    }


}
