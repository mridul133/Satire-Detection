class A{
	/**
	static{
		System.out.println("Static block A");
	}
	{
		System.out.println("Normal block A");
	}
	*/
	int a;
	A(){
		a = 0;
	}
	A(int a){
		//System.out.println("Constructor A");
		this.a = a;
	}
	static void s_method(){
		System.out.println("Static method inside A");
	}
	void method(){
		System.out.println("method inside A");
	}
}

class B extends A{
	/**
	static{
		System.out.println("Static block B");
	}
	{
		System.out.println("Normal block B");
	}
	*/
	int b;
	B(int a , int b){
		//System.out.println("Constructor B");
		//super(a);
		this.b = b;
		super.a = a;
	}
	static void s_method(){
		System.out.println("Static method inside B");
	}
	void method(){
		System.out.println("method inside B");
	}
}

class Test{
	public static void main(String[] args){
		/**
		B b1 = new B();
		double d = 13.0;
		int a = 12;
		double dd = d + a;
		System.out.println(dd);
		int[] arr = {3,5,4,6,1};
		for(int x : arr){
			System.out.println(x);
		}
		*/
		B b = new B(10 , 15);
		A a = b;
		//B bb = a; // invalid:: subclass cannot refer superclass
		System.out.printf("%d %d\n" , b.a , b.b);
		System.out.printf("%d\n" , a.a);
		
		a.method();
		a.s_method();
	}
	static{
		System.out.println("Static block Test");
	}
}