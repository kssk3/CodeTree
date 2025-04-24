import java.util.*;

public class Main {

    // 최대 이동 거리가 1,000,000까지 가능하므로 배열 크기 증가
    public static final int MAX = 1000001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 로봇 A 움직임 횟수
        int m = sc.nextInt(); // 로봇 B 움직임 횟수

        // 각 시간마다 로봇의 위치를 저장할 배열
        int[] robotA = new int[MAX];
        int[] robotB = new int[MAX];

        // 각 로봇의 총 이동 시간 계산
        int aCount = moved(robotA, n, sc);
        int bCount = moved(robotB, m, sc);

        // 두 로봇이 서로 만나는 횟수 계산
        int sameLocation = 0;
        
        // 두 로봇이 모두 움직이는 구간
        int minCount = Math.min(aCount, bCount);
        for (int i = 1; i <= minCount; i++) {
            // 직전에는 다른 위치에 있다가 같은 위치에 오는 경우
            if (robotA[i] == robotB[i] && robotA[i-1] != robotB[i-1]) {
                sameLocation++;
            }
        }
        
        // 한 로봇이 멈추고 다른 로봇이 계속 움직이는 경우
        if (aCount > bCount) {
            // B가 먼저 멈춘 경우
            for (int i = bCount + 1; i <= aCount; i++) {
                // B의 마지막 위치와 A의 현재 위치가 같고, 직전 위치는 달랐다면
                if (robotA[i] == robotB[bCount] && robotA[i-1] != robotB[bCount]) {
                    sameLocation++;
                }
            }
        } else if (bCount > aCount) {
            // A가 먼저 멈춘 경우
            for (int i = aCount + 1; i <= bCount; i++) {
                // A의 마지막 위치와 B의 현재 위치가 같고, 직전 위치는 달랐다면
                if (robotB[i] == robotA[aCount] && robotB[i-1] != robotA[aCount]) {
                    sameLocation++;
                }
            }
        }

        System.out.println(sameLocation);
    }

    // 로봇 이동 시뮬레이션 및 위치 기록 함수
    public static int moved(int[] arr, int x, Scanner sc) {
        int position = 0; // 현재 위치
        int time = 0;     // 현재 시간
        
        // 초기 위치 저장 (시간 0일 때)
        arr[0] = position;
        
        for (int i = 0; i < x; i++) {
            int duration = sc.nextInt();      // 몇 초 동안
            char direct = sc.next().charAt(0); // 어느 방향으로
            
            // 각 시간별로 위치 계산하여 배열에 저장
            for (int j = 0; j < duration; j++) {
                time++;
                if (direct == 'R') {
                    position++;
                } else { // 'L'
                    position--;
                }
                arr[time] = position; // 해당 시간의 위치 저장
            }
        }
        
        return time; // 총 이동 시간 반환
    }
}
