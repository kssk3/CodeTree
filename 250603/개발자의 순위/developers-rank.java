import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();

        int[][] board = new int[K][N];

        for(int i = 0; i < K; i++){
            for(int j = 0; j < N; j++){
                board[i][j] = sc.nextInt();
            }
        }

        int[] score = new int[2021];
        for(int i = 0; i < K; i++){
            for(int j = 0; j < N - 1; j++){
                for(int k = j + 1; k < N; k++){
                    score[board[i][j] * 100 + board[i][k]]++;
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i < score.length; i++){
            if(score[i] == K)cnt++;
        }

        System.out.println(cnt);
    }
}