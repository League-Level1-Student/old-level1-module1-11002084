
public class SmurfRunner {
	public static void main(String[] args) {
		Smurf handySmurf=new Smurf("Handy Smurf");
		Smurf papaSmurf=new Smurf("Papa Smurf");
		Smurf smurfette=new Smurf("Smurfette");
		handySmurf.eat();
		papaSmurf.eat();
		smurfette.eat();
		System.out.println(handySmurf.getName());
		System.out.println(papaSmurf.getName());
		System.out.println(smurfette.getName());
		System.out.println(handySmurf.getHatColor());
		System.out.println(papaSmurf.getHatColor());
		System.out.println(smurfette.getHatColor());
		System.out.println(handySmurf.isGirlOrBoy());
		System.out.println(papaSmurf.isGirlOrBoy());
		System.out.println(smurfette.isGirlOrBoy());
		
	}
}
