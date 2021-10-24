class Employee
{
	public final void show()
	{
		System.out.println("show() inside Employee");
	}
}

final class Unit extends Employee
{
	public static void show1()
	{
		final int x=100;
		System.out.println("show() inside Unit");
		System.out.println(x);
	}
}


public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Unit();
		Unit.show1();
	}

}
