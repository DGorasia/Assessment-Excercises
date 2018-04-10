
public class PlayerCharacteristics extends Player {
	public PlayerCharacteristics(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public static int[][] grid = new int[50][50];

	private String colour;
	private String height;
	//private String weight;
	
	//Gives colour characteristics to the player
	public static final String Red = "Red";
	public static final String Blue = "Blue";
	public static final String Orange= "Orange";
	public static final String Yellow= "Yellow";
	
	//Gives the option for the player to customise height of player avatar.
	
	public static final String Charactertype1= "Tall";
	public static final String Charactertype2= "Medium";
	public static final String Charactertype3= "Short";
	
	//Creates the method for adding in player and colour characteristics.
	public void playerCharacteristics (String colour, String height) {
		this.colour = colour;
		this.height = height;
		//this.weight = weight;
	
	}
	
	public String getColour () {
		return this.colour();
		
	}
	
	private String colour() {
		// TODO Auto-generated method stub
		return this.colour;
	}

	public String getHeight () {
		return this.height();
	}

	private String height() {
		// TODO Auto-generated method stub
		return this.height;
	}
}

