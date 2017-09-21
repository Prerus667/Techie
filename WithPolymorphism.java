// to show the significance of polymorphism

interface IDraw{
	public void draw();
}

class Circle implements IDraw{
	public void draw(){
		System.out.println("Draw a circle");
	}
}

class Square implements IDraw{
	public void draw(){
		System.out.println("Draw a square");

		}
	}

 public class WithPolymorphysim{
	public static void main(String [] args){
		//List<MyType> myList = new ArrayList<MyType>();
		List<IDraw> myList = new ArrayList<IDraw>();
		myList.add(new Circle());
		myList.add(new Square());
		
		for(IDraw item : myList){ //for any iDraw item in myList do item.draw()
			item.draw();
		}
		
	}

}