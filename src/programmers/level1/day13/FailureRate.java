package programmers.level1.day13;

import java.util.*;

public class FailureRate {
    public static void main(String[] args) {
        int N = 4; //5 4
        int[] stages = {4,4,4,4,4}; //{2,1,2,6,2,4,3,3} {4,4,4,4,4}

        FailureRate failureRate = new FailureRate();
        System.out.println(Arrays.toString(failureRate.rate(N, stages)));
        System.out.println(0/(float)0); //Nan
        System.out.println(0/(float)1); //0.0
    }
    public int[] rate(int N, int[] stages) {
        Float[] rate = new Float[N];
        Map<Integer, Float> map = new HashMap<>();
        int[] result = new int[N];
        int stagesLength = stages.length;
        int stage = 1;
        int cnt;
        int sum = 0;

        while(stage != N+1) {
            cnt = 0;
            for(int i=0; i<stagesLength; i++) {
               if(stages[i] == stage) {
                   cnt++;
               }
            }
            if(stagesLength-sum == 0) {
                rate[stage-1] = (float)0;
            }else {
                rate[stage-1] = (stage == 1) ? cnt/(float)stagesLength : cnt/(float)(stagesLength-sum);
            }
            map.put(stage, rate[stage-1]);
            sum += cnt;
            stage++;
        }

        Arrays.sort(rate, Collections.reverseOrder());

        while(result[N-1] == 0) {
            for(int i=0; i<rate.length; i++) {
                for(int j=1; j<=N; j++) {
                    if(rate[i] == map.get(j)){
                        result[i] = j;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
