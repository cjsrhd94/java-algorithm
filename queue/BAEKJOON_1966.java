package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BAEKJOON_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            LinkedList<int[]> q = new LinkedList<int[]>();
            st = new StringTokenizer(br.readLine()," ");
            for(int j = 0; j < N; j++ ){
                // {초기 위치, 중요도}
                q.add(new int[] { j, Integer.parseInt(st.nextToken()) });
            }

            int count = 0;

            while(!q.isEmpty()){
                int[] front = q.poll(); // 첫 원소
                boolean isMax = true;   // front가 가장 큰 원소인지 판단

                for(int j = 0; j < q.size(); j++){
                    // 처음 뽑은 원소보다 큐에 있는 j번째 원소가 중요도가 클 경우
                    if(front[1] < q.get(j)[1]) {
                        q.add(front);
                        for(int k = 0; k < j; k++){
                            q.add(q.poll());
                        }

                        isMax = false;
                        break;
                    }
                }

                if(isMax == false){
                    continue;
                }
                count++;

                if(front[0] == M){
                    break;
                }
            }

            System.out.println(count);
        }
    }
}
