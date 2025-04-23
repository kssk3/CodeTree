import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] posA = new int[1000001];
        int[] posB = new int[1000001];
        
        // A와 B의 이동 기록
        int totalTime = recordMovements(posA, n, sc);
        recordMovements(posB, m, sc);
        
        // 최초 만남 시간 확인
        int meetingTime = -1;
        for (int time = 1; time <= totalTime; time++) {
            if (posA[time] == posB[time]) {
                meetingTime = time;
                break;
            }
        }
        
        System.out.println(meetingTime);
    }
    
    private static int recordMovements(int[] positions, int moves, Scanner sc) {
        int time = 0;
        int position = 0;
        
        for (int i = 0; i < moves; i++) {
            char direction = sc.next().charAt(0);
            int duration = sc.nextInt();
            
            for (int j = 0; j < duration; j++) {
                time++;
                // 방향에 따라 위치 업데이트
                position += (direction == 'R') ? 1 : -1;
                positions[time] = position;
            }
        }
        return time; // 총 이동 시간 반환
    }
}
