import java.util.Scanner;

public class BaseballCalcs {


// creating the variables.

	private String name; //Name of the player

	private double hits; //Number of Hits

	private double doubles; //Doubles

	private double triples; //Triples

	private double homeruns; //Homeruns

	private double runs; //Runs

	private double walks; //Walks

	private double atbat; //At Bats

	private double hbp; //Hits By Pitch

	private double sacfly; //Sacrifice Flys

	

	public BaseballCalcs(String name, double hits, double doubles, double triples, double homeruns, double runs,

			double walks, double atbat, double hbp, double sacfly) {

		super();

		// Constructors:
		
		this.name = name;

		this.hits = hits;

		this.doubles = doubles;

		this.triples = triples; 

		this.homeruns = homeruns; 

		this.runs = runs;

		this.walks = walks; 

		this.atbat = atbat; 

		this.hbp = hbp;

		this.sacfly = sacfly; 

			}

	
	// Methods:
	
	//Method for calculating Bating Average (BA)
	public double batting_average() {

		return this.hits/this.atbat;

	}
	
	//Method for calculating the total amount of bases (TB)
	public double total_bases() {

		double temp = this.hits + (2*this.doubles) + (3*this.triples) +(4*this.homeruns);

		return temp;

	}
	
	//Method for calculating the slugging percentage (SLG)
	public double slugging_perc() {

		double temp = (this.hits + (2*this.doubles) + (3*this.triples) + (4*this.homeruns))/this.atbat;

		return temp;

	}

	//Method for calculating on base percentage (OBP)
	public double onbasepercentage() {

		double temp = (this.hits+this.walks+this.hbp)/(this.atbat+this.walks+this.sacfly);

		return temp;

	}

	//Method for calculating o base + slugging percentage (OBPS)
	public double  onbaseslug() {

		double temp = ((this.hits+this.walks+this.hbp)/(this.atbat+this.walks+this.sacfly))+((this.hits + (2*this.doubles) + (3*this.triples) + (4*this.homeruns))/this.atbat);

		return temp;

	}

	public static void main(String[] args){

		

		java.util.Scanner input = new Scanner(System.in);

		

		String name;

		double hits;

		double doubles;

		double triples;

		double homeruns;

		double runs;

		double walks; 

		double atbat;

		double hbp;

		double sacfly;

		



		System.out.println("Name the player"); //Ask for the player's name

		name = input.next();

		

		System.out.println("how many hits?"); //Asks for amount of hits

		hits = input.nextDouble();

		

		System.out.println("how many doubles?"); //Asks for amount of doubles

		doubles = input.nextDouble();

		

		System.out.println("how many triples?"); //Asks amount of triples

		triples = input.nextDouble();

		

		System.out.println("homeruns??"); //Asks for amount of homeruns?

		homeruns = input.nextDouble();

		

		System.out.println("runs??"); //Aks for amount of runs

		runs = input.nextDouble();

		

		System.out.println("walks"); //Asks for amount of walks

		walks = input.nextDouble();

		

		System.out.println("atbat"); //Asks for amount of at bats

		atbat = input.nextDouble();



		System.out.println("hit by pitch?"); //Asks for amount of hits by pitch

	    hbp = input.nextDouble();

		

		System.out.println("sacfly"); //Asks for amount of Sacrifice Flys

		sacfly = input.nextDouble();

	

		BaseballCalcs bcalcs = new BaseballCalcs(name, hits, doubles, triples, homeruns, runs, walks, atbat, hbp, sacfly);

		double BA = bcalcs.batting_average(); 

		System.out.printf("batting average:" + "%f\n", BA); //Prints the batting average for the player

		

		double tb = bcalcs.total_bases();

		System.out.printf("total bases:" + "%f\n", tb); //Prints the total bases for the player (TB)

		

		double sp = bcalcs.slugging_perc();

		System.out.printf("slugging percentage:" + "%f\n", sp); //Prints the slugging percentage for the player (SP)

		

		double obp = bcalcs.onbasepercentage();

		System.out.printf("on base percentage" + "%f\n", obp); //Prints the on base percentage for the player (OBP)

		

		double obps = bcalcs.onbaseslug();

		System.out.printf("onbaseslugging" + "%f\n", obps); //Prints the on base + slugging percentage for the player (OBPS)

	input.close();

	}

	

	

}