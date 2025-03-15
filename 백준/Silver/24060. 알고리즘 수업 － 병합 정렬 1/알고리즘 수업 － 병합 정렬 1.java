import java.util.Scanner;

public class Main {

	static int K, count = 0, result = -1;
    static int[] tmp; // 임시 배열

	public static void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2; // 중간 지점
            mergeSort(A, p, q); // 전반부 정렬
            mergeSort(A, q + 1, r); // 후반부 정렬
            merge(A, p, q, r); // 병합
        }
    }

    public static void merge(int[] A, int p, int q, int r) {
        int i = p, j = q + 1, t = 0;

        while (i <= q && j <= r) {
            if (A[i] <= A[j]) tmp[t++] = A[i++];
            else tmp[t++] = A[j++];
        }

        while (i <= q) tmp[t++] = A[i++];
        while (j <= r) tmp[t++] = A[j++];

        // 정렬된 결과를 원래 배열 A[p..r]에 저장하면서 저장 횟수 카운트
        for (i = p, t = 0; i <= r; i++, t++) {
            A[i] = tmp[t];
            count++;
            if (count == K) result = A[i]; // K번째 저장되는 값 기록
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        K = scanner.nextInt();
        int[] A = new int[N];
        tmp = new int[N];

        for (int i = 0; i < N; i++) A[i] = scanner.nextInt();

        mergeSort(A, 0, N - 1);

        System.out.println(result);
        scanner.close();
    }
}
