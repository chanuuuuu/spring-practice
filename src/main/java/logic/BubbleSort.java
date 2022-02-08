package logic;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort<T extends Comparable<T>> {

    public List<T> sort(List<T> list) {
        // cloning 하여서 새로운 리스트 생성
        List<T> output = new ArrayList<>(list);

        for (int i = list.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (output.get(j).compareTo(output.get(j + 1)) > 0) {
                    T temp = output.get(j);
                    output.set(j, output.get(j + 1));
                    output.set(j + 1, temp);
                }
            }
        }

        return output;
    }
}
