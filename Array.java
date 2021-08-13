class Program{
	public static void main(String args[]){
		int a[] = {2,5,6,8,9,11,15};
		int value = 1;
		for(int i=0; i<=6; i++)
			value *= a[i];
		System.out.println(value);
	}
}