import java.util.Arrays;
import java.util.List;
import logic.BubbleSort;
import logic.JavaSort;
import service.StringSortService;

public class Main {

    public static void main(String[] args) {
        StringSortService service = new StringSortService(new JavaSort<>());
        // 안의 상태 변수를 변경할 수 있으나,
        //service.setSort(new JavaSort<>());
        List<String> list = service.doSort(Arrays.asList(args));
        System.out.println("hello world " + list.toString());
    }
}
