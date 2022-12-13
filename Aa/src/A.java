class A {
	public int a;
	private int b;
	protected int c;
	int d;
	final int e = 0;
	static int f;
	
	//Strictfp not applicable to variables
	//strictfp double g;
	

	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1.a = 10);
		System.out.println(a1.b = 20);
		// System.out.println(a1.k = 10);
	}

}
