import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] seats = sc.next().toCharArray();

        int maxDistance = 0;

        // 모든 빈 자리에 대해 시도
        for(int pos = 0; pos < n; pos++) {
            if(seats[pos] == '0') {  // 빈 자리에만 배치 가능
                char[] temp = seats.clone();
                temp[pos] = '1';  // 새로운 사람 배치
                
                // 이 배치에서 가장 가까운 두 사람의 거리 찾기
                int minDistance = Integer.MAX_VALUE;
                for(int i = 0; i < n; i++) {
                    if(temp[i] == '1') {
                        for(int j = i + 1; j < n; j++) {
                            if(temp[j] == '1') {
                                minDistance = Math.min(minDistance, j - i);
                                break;  // 가장 가까운 것만 찾으면 됨
                            }
                        }
                    }
                }
                
                // 최대값 갱신
                maxDistance = Math.max(maxDistance, minDistance);
            }
        }

        System.out.println(maxDistance);
    }
}
