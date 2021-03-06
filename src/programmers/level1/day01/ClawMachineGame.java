package programmers.level1.day01;

import java.util.Stack;

public class ClawMachineGame {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        System.out.println(clawMachine(board,moves));
    }
    public static int clawMachine(int[][] board, int[] moves) {
        int boardLength = board.length;
        int movesLength = moves.length;
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;

        for(int i=0; i<movesLength; i++){
            for(int j=0; j<boardLength; j++){
                if(board[j][moves[i]-1] != 0){
                    if(!stack.empty()){
                        if(stack.peek() == board[j][moves[i]-1]){
                            stack.pop();
                            result += 2;
                        }else{
                            stack.push(board[j][moves[i]-1]);
                        }
                    }else{
                        stack.push(board[j][moves[i]-1]);
                    }
                    break;
                }
            }
        }
        return result;
    }
}