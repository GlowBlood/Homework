import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Choice{

    static List choose(int a[]) {
        int N = a.length;
        int maxSum = a[0];
        int sum = 0;
        int k = 0;
        int leftIndex = 0;
        int rightIndex = 0;


        for (int i = 0; i < N; i++) {
            sum += a[i];
            if (sum > maxSum) {
                maxSum = sum;
                leftIndex = k + 1;
                rightIndex = i;
            }

            if (sum < 0) {
                sum = 0;
                k = i;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(maxSum);
        result.add(leftIndex);
        result.add(rightIndex);
        return result;
    }

}

