package master.utilities;

public class counter {

	static int count=-1;
    public static void countincrease()
	{	
		count++;
		
	}
	public static void countdecrease()
	{
		count--;
		
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int n) {
		count=n;
	}
	public void countSet()
	{
		count=-1;
	}
}
