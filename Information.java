
public class Information {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog();
		
		d.setName("Dog");
		System.out.println("the name of the dog is  "+ d.getName());
		d.setId(123);
		System.out.println("the name of the dog is  "+ d.getId());

		Animal a = new Animal();
		a.setName("Animal");
		a.setId(678);
		System.out.println("the name of the animal is " + a.getName());
		System.out.println("the name of the animal is  "+ a.getId());
		
		Cat c = new Cat();
		c.setName("Cat");
		c.setId(890);
		System.out.println("the name of the cat is " + c.getName());
		System.out.println("the name of the cat is  "+ c.getId());

	}

}
