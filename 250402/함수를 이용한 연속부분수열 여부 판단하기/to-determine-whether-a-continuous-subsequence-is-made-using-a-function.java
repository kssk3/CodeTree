import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); // 수열 A의 길이
        int n2 = sc.nextInt(); // 수열 B의 길이

        // 수열 A
        int[] a = new int[n1];
        // 수열 B
        int[] b = new int[n2];

        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        findSequence(a, b);
    }

    public static void findSequence(int[] a, int[] b) {
        if (validate(a, b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean validate(int[] a, int[] b) {
        int lenA = a.length;
        int lenB = b.length;

        // B가 A보다 길면 포함될 수 없음
        if (lenB > lenA) {
            return false;
        }

        // A에서 B가 연속된 부분 수열로 존재하는지 확인
        for (int i = 0; i <= lenA - lenB; i++) { // A에서 시작 위치 탐색
            int j;
            for (j = 0; j < lenB; j++) { // B와 비교
                if (a[i + j] != b[j]) {
                    break;
                }
            }
            if (j == lenB) { // B가 완전히 일치하면 true 반환
                return true;
            }
        }
        return false; // 일치하는 부분 수열이 없으면 false 반환
    }
}

