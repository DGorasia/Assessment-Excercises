
//Class to create a grid for the game applications
import java.util.Scanner;
import java.lang.*;

public class gAmeGrid {
	public static int[][] grid = new int[50][50];

	public static void main(String[] args) {
		inputGrid();
		receiveInput();
		printGrid();
//		Scanner reader = new Scanner(System.in);
//		
//		System.out.println("Please select the map size you wish to play on");
//		String input = reader.next(); //The user should be able to select from a drop down menu.
//		System.out.println ("Please type level of difficulty");
//		String input4 = reader.next();
	}

	public static void inputGrid() {
		int fill = 1;

		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[0].length; y++) {
				grid[x][y] = fill;
			}

		}
	}

	public static void receiveInput() {
		char firstCharacter, drawCharacter;
		int X1, Y1, X2, Y2;
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine()) {
			firstCharacter = in.next().charAt(0);
			if (firstCharacter == 'p') {
				X1 = in.nextInt();
				Y1 = in.nextInt();
				drawCharacter = in.next().charAt(0);
				in.nextLine();
				plotPoint(X1, Y1, drawCharacter);
			}

			if (firstCharacter == 'l') {

				X1 = in.nextInt();
				Y1 = in.nextInt();
				X2 = in.nextInt();
				Y2 = in.nextInt();
				drawCharacter = in.next().charAt(0);
				in.nextLine();

				drawLine(X1, Y1, X2, Y2, drawCharacter);
			}
			if (firstCharacter == 'c') {
				in.nextLine();
				receiveInput();
			}
			if (firstCharacter == 'd') {
				in.nextLine();
				printGrid();
			}
			if (firstCharacter == 'q') {
				return;
			}
		}
	}

	public static void plotPoint(int X, int Y, char character) {
		grid[X][Y] = character;
	}

	// method: drawLine
	// purpose: receives the l command and draws a line with given coordinates and
	// char
	public static void drawLine(int X1, int Y1, int X2, int Y2, char character)
	    {
	    int stopX = X1;
	    int stopY = Y1;
	    int stopX2 = X2;
	    int stopY2 = Y2;
	    // checks for horizontal line, left to right
	    if(Y1==Y2 && X1<X2){
	        for(int i = 0; stopX == stopX2; i++){ 
	        grid[X1+i][Y1] = character;
	        }
	    }

// checking for horizontal line, right to left
	    if(Y1==Y2 && X1>X2){
	        for(int i = 0; stopX2 == stopX; i--){
	        grid[X1+i][Y1] = character;
	        }
	    }
// checking for vertical line, top to bottom
	    if(X1==X2 && Y1<Y2){
	        for(int i = 0; stopY == stopY2; i++){
	        grid[X1][Y1+i] = character;
	        }
	    }
	    
	    if(X1==X2 && Y1>Y2){
	        for(int i = 0; stopY2 == stopY; i--){
	        grid[X1][Y1+i] = character;
	        }
	    }
	    }
	    
// method: printGrid
// prints the grid to show the picture
	public static void printGrid() {
	    for (int j = 0; j < grid[0].length; j++){
	        for(int i = 0; i <  grid.length; i++){
	        	System.out.print(grid[i][j]);
	        	if(i == grid.length-1){
	        		System.out.println();
	        }
	        }
	    }
	}
	
	public static void TreasureCoordinates() {
		//int X = 25;
		//int Y = 25;
		for (int X = 25; X > grid.length; X++) {
			System.out.print("9" + "\t");
			for (int Y =25; Y < grid.length; Y--) {
				System.out.print("1" + "\t");
			}
				
			}
	}
	
}

