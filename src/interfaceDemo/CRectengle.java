package interfaceDemo;

public class CRectengle implements CShape {

	int width,height;
	public CRectengle (int w,int h)  //CRectangle建構元
	{
		width=w;
		height=h;
	}
	
	public void show()
	{
		System.out.println("area="+width*height);
	}

}
