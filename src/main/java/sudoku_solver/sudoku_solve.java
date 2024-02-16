package sudoku_solver;

import java.util.Arrays;

public class sudoku_solve {
	public static void main(String[] args) {
		int[][] board= {{0,0,0,2,6,0,7,0,1},
		               {6,8,0,0,7,0,0,9,0},
		               {1,9,0,0,0,4,5,0,0},
		               {8,2,0,1,0,0,0,4,0},
		               {0,0,4,6,0,2,9,0,0},
		               {0,5,0,0,0,3,0,2,8},
		               {0,0,9,3,0,0,0,7,4},
		               {0,4,0,0,5,0,0,3,6},
		               {7,0,3,0,1,8,0,0,0}};
		if(solve(board,0,0)) {
			for(int i=0;i<board.length;i++) {
				System.out.println(Arrays.toString(board[i]));				
			}
		}
		else {
			System.out.println("no solution");
		}
		}
	static boolean is_valid(int[][] board, int row_no,int col_no,int number) {
		for(int i=0;i<9;i++) {
			if(board[row_no][i]==number) {
				return false;
			}
		}
			for(int i=0;i<9;i++) {
				if(board[i][col_no]==number) {
					return false;
				}
				
			}
		int field_row=row_no-row_no%3;
		int field_col=col_no-col_no%3;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(board[field_row+i][field_col+j]==number) {
					return false;
				}
			}
		}
		return true;
		
	}
	static boolean solve(int[][]board, int row_no,int col_no) {
		if(col_no==9) {
			if(row_no==8) {
				return true;
			}
			row_no+=1;
			col_no=0;
		}
		if(board[row_no][col_no]>0) {
			return solve(board,row_no,col_no+1);
		}
		for(int i=1;i<=9;i++) {
			if(is_valid(board,row_no,col_no,i)) {
				board[row_no][col_no]=i;
				if(solve(board,row_no,col_no+1)) {
					return true;
				}
			}
			board[row_no][col_no]=0;
		}
		
		return false;
	}

}
