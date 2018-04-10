//Class to create the player object
public class Player {
	
	String A = "North";
	String B = "East";
	String C = "South";
	String D =  "West";
	int x;// proximity or distance -- Longitude
	int y;// Latitude
	private String PlayerName;
	
	public static int[][] grid = new int[50][50];

	
//Assigning player name as string data type	
	public Player(String name) {
		PlayerName = name;
	}
	
	public void setName (String name) {
		this.PlayerName = name;
	}
	
	public String getName() {
		return PlayerName;
	}
	
	public void pLayerDirection (String name, int x, int y) {
		if (x <=10) {
			System.out.println(name + ", you are heading North and are approaching a potential dangerous area. Go south!!");
		}
		
		else; {
			if (x >=20 && y <=50) {
				System.out.println(name + "You will be approaching the danger zone in a couple of meters. Head towards East for the treasure chest.");
			}
			else; {
				if (x >=50 && y <=100) {
					System.out.println(name + "Keep Going!!");
				}
				else; {
					if (x >100 && y>100) {
						System.out.println(name + "You are venturing of course. Stay within the Grid!!");
					}
				}
			}
		}
	}
	
	public static void TreasureCoordinates2 () {
		for (int X = 25; X > grid.length; X++) {
			System.out.println("9" + "\t");
			for (int Y =25; Y < grid.length; Y--) {
				System.out.println("1" + "\t");
			}
				
			}
	}
	
	//Creating a method to make the person object move.
	

}
	


