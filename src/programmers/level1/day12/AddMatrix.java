package programmers.level1.day12;

import java.util.Arrays;

public class AddMatrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1},{2}};//{{1,2},{2,3}};
        int[][] arr2 = {{3},{4}};//{{3,4},{5,6}};
        AddMatrix addMatrix = new AddMatrix();
        System.out.println(Arrays.toString(addMatrix.add(arr1, arr2)[0]));
        System.out.println(Arrays.toString(addMatrix.add(arr1, arr2)[1]));
    }
    public int[][] add(int[][] arr1, int[][] arr2) {
        int rowLength = arr1.length; //Math.max(arr1.length, arr2.length)
        int colLength = arr1[0].length; //Math.max(arr1[0].length, arr2[0].length)
        int[][] answer = new int[rowLength][colLength];

        for(int i=0; i<rowLength; i++) {
            for(int j=0; j<colLength; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
