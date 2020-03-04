
// Requirement: add 2 numbers in one class and call it in a different class

package p1.p2;
/**
*This class holds logic for addition
*/
class Add{
	/**
	* Method to add two local variables
	*/
	public static void add(){
		int i=10,j=20;
		System.out.println(i+j);
	}
}

class AddTest{
	public static void main(String...abc){
		Add.add();
	}
}