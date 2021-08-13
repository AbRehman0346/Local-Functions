class Test{
	public static void main(String args[]){
		Program p = new Program();
		p.gettingProfit();
	}
}

class Program{
	public void gettingProfit(){
		int perLoad = 100, spend = 50, order = 10, profit, totalProfit;		
		profit = perLoad - spend;
		totalProfit = profit * order;
		System.out.println("Profit is: " + totalProfit);	
	}
}