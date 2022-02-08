package com.spring.practice.logic;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JavaSortTest {

    @DisplayName("데이터 리스트를 입력하면, 정렬된 리스트를 반환한다.")
    @Test
    void testSort() {
        //given
        List<Integer> input = List.of(5, 3, 1, 4, 2);
        JavaSort<Integer> javaSort = new JavaSort<>();

        //when
        List<Integer> output = javaSort.sort(input);

        //then
        assertThat(output).isEqualTo(List.of(1, 2, 3, 4, 5));

    }

}
