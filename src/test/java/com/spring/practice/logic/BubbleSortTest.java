package com.spring.practice.logic;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    // 1. should - when 패턴 : 내가 테스트 해야할 요소, 그리고 조건에 대한 언급
    // 2. given - when -then : ex: givenList_whenSorting_thenReturnSortedList
    @DisplayName("데이터 리스트를 입력하면, ")
    @Test
    void testSort() {
        //given
        List<Integer> input = List.of(5, 3, 1, 4, 2);
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        //when
        List<Integer> output = bubbleSort.sort(input);

        //then
        assertThat(output).isEqualTo(List.of(1, 2, 3, 4, 5));

    }
}
