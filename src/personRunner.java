
public class personRunner {
	public static void main(String[] args) {
		Person person=new Person();
		person.setSuperpower("telekenisis");
		person.setName("Daniel Diaz");
		System.out.println(person.getName()+" has mad "+person.getSuperpower()+" skills.");
		Person person2=new Person();
		person2.setSuperpower("despacitoing");
		person2.setName("Luis Fonsi");
		System.out.println(person2.getName()+" has mad "+person2.getSuperpower()+" skills.");
		Person person3=new Person();
		person3.setSuperpower("earraping");
		person3.setName("Thomas the Tank Engine");
		System.out.println(person3.getName()+" has mad "+person3.getSuperpower()+" skills.");
	}
}
