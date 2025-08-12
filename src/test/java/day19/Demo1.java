package day19;
//example of encapsulation
class A
{
	private int i;	//declaration
	
	A(int i){
		this.i=i;//initialization
	}
	
	int get()
	{
		return i;//utilization
	}
}
public class Demo1 {

	public static void main(String[] args) {
		A a1=new A(10);
		System.out.println(a1.get());

	}

}