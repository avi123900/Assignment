class Area{
	public void calculateShapeArea(int numberOfSides, int length) {
		if(numberOfSides==1) {
			double c= 3.14*length*length;
			System.out.println("The area of circle is"+c);
			
		}
		if(numberOfSides==3) {
			double d=0.433*length*length;
			System.out.println("The area of triangle is"+d);
			
		}
		if(numberOfSides==4) {
			double e=length*length;
			System.out.println("The area of square is"+e);}
		if(numberOfSides==2||numberOfSides>4) {
			System.out.println("NO Shapes Present");
		}
	}
}
public class Shapes {
	public static void main(String args[]) {
		Area ob=new Area();
		ob.calculateShapeArea(3,12);
		Area ob1=new Area();
		ob1.calculateShapeArea(4,15);
		Area ob2=new Area();
		ob2.calculateShapeArea(5,15);
	}

}
