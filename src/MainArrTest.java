import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class MainArrTest {

    private final MainArr mainArr = new MainArr();

    @ParameterizedTest
    @MethodSource("CheckArr1")
    void arr(int[] beforeArr, int[] newArr) {
        int[] currentArr = mainArr.Arr(beforeArr);
        Assertions.assertArrayEquals(newArr, currentArr);
    }
    private static Stream<Arguments> CheckArr1() {
        List<Arguments> arguments = new ArrayList<>() {{
            add(Arguments.arguments(new int[]{ 1,2,3,4,5 }, new int[]{ 5 }));
            add(Arguments.arguments(new int[]{ 1,2,3,4 }, new int[]{ }));
            add(Arguments.arguments(new int[]{ 4,1,2,4,3,4,5 }, new int[]{ 5 }));
            add(Arguments.arguments(new int[]{ 4,1,2,3,5 }, new int[]{ 1,2,3,5 }));
        }};
        return arguments.stream();
    }

    @ParameterizedTest
    @MethodSource("CheckArr2")
    void Arr2(int[] arr, boolean afterResult) {
        boolean currentResult = mainArr.Arr2(arr);
        Assertions.assertEquals(afterResult, currentResult);
    }

    private static Stream<Arguments> CheckArr2() {
        List<Arguments> arguments = new ArrayList<>() {{
            add(Arguments.arguments(new int[]{ 1, 1, 1, 4, 4 }, true));
            add(Arguments.arguments(new int[]{ 1, 1, 1, 1, 1 }, true));
            add(Arguments.arguments(new int[]{ 4, 9, 4, 3, 7 }, false));
            add(Arguments.arguments(new int[]{ 1, 6, 1, 4, 3 }, false));
        }};
        return arguments.stream();
    }
}