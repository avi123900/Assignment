 class CircleDemo {
	private float radius;
	protected static float pi;
	
	private CircleDemo(){
		radius=1.5f;
	}
	
	protected CircleDemo(float radius) {
		this(radius,3.5f);
	}
	
	private CircleDemo(float radius,float pi) {
		this.radius=radius;
		this.pi=pi;
	}
	
	public static double calculateCircleArea(float radius) {
		return pi*radius*radius;
	}
	
	public static double calculateCircumference(float radius) {
		return 2*pi*radius;
	}
 
	public static void main(String []args) {
		CircleDemo cr=new CircleDemo(12);
		System.out.println("Area of Circle : "+cr.calculateCircleArea(cr.radius));
		System.out.println("Circumference of Circle : "+cr.calculateCircumference(cr.radius));
	}
	}
	
	
