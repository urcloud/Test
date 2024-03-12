import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 회원의 수 입력
        int N = scanner.nextInt();
        scanner.nextLine(); // 개행문자 처리

        // 회원 정보를 저장할 배열 생성
        Member[] members = new Member[N];

        // 회원 정보 입력받아 배열에 저장
        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            members[i] = new Member(age, name);
        }

        // 병합 정렬로 회원 정보 정렬
        mergeSort(members, 0, N - 1);

        // 정렬된 회원 정보 출력
        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
        }
    }

    // 병합 정렬 알고리즘 구현
    private static void mergeSort(Member[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(Member[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Member[] L = new Member[n1];
        Member[] R = new Member[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (L[i].age <= R[j].age) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}

class Member {
    int age;
    String name;

    Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
