
public class SeaCreatureRunner {
    public static void main(String[] args) {
		SeaCreature Spongebob=new SeaCreature("Spongebob");
		SeaCreature Patrick=new SeaCreature("Patrick");
		SeaCreature Squidward=new SeaCreature("Squidward");
		System.out.println(Spongebob.getName());
		Spongebob.eat();
		Spongebob.laugh();
		System.out.println(Squidward.getName());
		Squidward.eat();
		Squidward.laugh();
		System.out.println(Patrick.getName());
		Patrick.eat();
		Patrick.laugh();
		
	}
}
