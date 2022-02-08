package com.spring.practice.logic;

import java.util.List;
import org.springframework.stereotype.Component;

/**
 * 정렬 기능을 제공하는 인터페이스 {@link Comparable}을 구현해야한다.
 * 인터페이스는 가급적 주석처리를 하는 것이 좋다.
 * @param <T>
 */
@Component
public interface Sort <T extends Comparable<T>> {

    // 가상 메소드를 정의하여 반드시 오버라이드 하도록 강제한다.
    List<T> sort(List<T> list);

}
