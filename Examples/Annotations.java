package Examples;
@Deprecated
class classA
{
	public void showTheDataWhichBelongsToThisClass()
	{
		System.out.println("in show A");
	}
}

class classB extends classA 
{
	@Override
//	public void showTheDataWhichBelongToThisClass()
	public void showTheDataWhichBelongsToThisClass()
	{
		System.out.println("in show B");
	}
}
public class Annotations {
    public static void main(String[] args) {
        classB obj=new classB();
        obj.showTheDataWhichBelongsToThisClass();
    }
    
}
