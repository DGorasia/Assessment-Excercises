import java.util.Scanner;

public class MainFlow {

	private String PlayerName;
	public String colour;
	public String weight;
	public int[][] grid = new int[50][50];

	public static void main(String[] args) {
		//Creating the user input GUI
		Scanner reader = new Scanner (System.in);
		
		System.out.println( "Please enter your name");
		
		String input = reader.next();
		
		System.out.println ("Hello " + input);
		
		System.out.println("Welcome to Baren Moor");
		
		String input2 = reader.next();
		
		System.out.println ("Please select the colour of your character.");
		
		String input3 = reader.next ();
		
		System.out.println("You have selected the colour " + input3);
		
		System.out.println ("Please proceed to the main menu.");
		
		
		//
		MainFlow test = new MainFlow();
		//test.getName("Devun Gorasia"); // new object returns the players name inputed.
		//test.getColour("Red");
		test.pLayerDirection("Devun Gorasia", 50, 60);
		gAmeGrid.inputGrid();
		gAmeGrid.printGrid();
		gAmeGrid.TreasureCoordinates();
		Player.TreasureCoordinates2();
		System.out.println(gAmeGrid.grid);
		
		
	}
	
	//method to print out the grid
	public void inputGrid() {
		int fill = 1;
		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[0].length; y++) {
				grid[x][y] = fill;
				System.out.println(gAmeGrid.grid[5][6]);
			}
		}
	}
	
		//test.printGrid();
		//test.receiveInput();
		//test.inputGrid();
		//test.plotPoint();

	public void getName(String name) {
		this.PlayerName = name;
		name = "Devun Gorasia";

		System.out.println("Welcome to Baren Moor: " + name);

	}

	public void getColour(String colour) {
		this.colour = colour;

		System.out.println("You have the selected the colour " + colour + " for your character.");

	}

	public void getplayerDirection(int x, int y) {
		this.pLayerDirection("Devun", 50, 60);
	}

	public void pLayerDirection(String name, int x, int y) {
		if (x <= 10) {
			System.out.println(
					name + ", you are heading North and are approaching a potential dangerous area. Go south!!");
		}

		else {
			if (x >= 20 && y <= 50) {
				System.out.println(name
						+ "You will be approaching the danger zone in a couple of meters. Head towards East for the treasure chest.");
			} else {
				if (x >= 50 && y <= 100) {
					System.out.println(name + " Keep Going!!");
				} else {
					if (x >= 100 && y >= 100) {
						System.out.println(name + " You are venturing of course. Stay within the Grid!!");
					}
				}
			}
		}
	}
}