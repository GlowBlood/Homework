public class Main {

   public static void main(){
       int a[] = {1, 5, 2, 8, -4, 0};
       Choice.choose(a);
       prn(a);

    }

   private static void prn(int a[]){
       for (int anA : a) System.out.print(anA + " ");
        System.out.println();
    }
}

class Choice{
    static int[] choose(int a[]) {
        int N = a.length;
        int maxSum = 0;
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

        return new int[]{maxSum, leftIndex, rightIndex};
    }
}

