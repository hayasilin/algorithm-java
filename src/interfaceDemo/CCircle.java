package interfaceDemo;

public class CCircle implements CShape {

	double radius;

	public CCircle(double r) {
		radius = r;
	}

	public void show() // 改寫介面中抽象函數
	{
		System.out.println("面積＝" + PI * radius * radius);
	}
}
