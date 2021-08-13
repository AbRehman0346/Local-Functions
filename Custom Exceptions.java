import java.util.Scanner;
class Program{
	public static void main(String args[]) {
		boolean sucessful = true;
		Scanner inputString = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name = inputString.nextLine();
		
		System.out.print("Enter Section (A/B): ");
		String section = inputString.nextLine();
		
		System.out.print("Enter Phone: ");
		String phone = inputString.nextLine();
		
		System.out.print("Enter Id: ");
		String id = inputString.nextLine();
		
		System.out.print("Enter Password: ");
		String password = inputString.nextLine();
		
		Program p = new Program();
		System.out.println();
		if (p.characterException(name)){
			sucessful = false;
			try{throw new MyException("Only Characters are allowed for Name.");}
			catch(MyException e){System.out.println(e);}
		}
		
		if(((!section.toUpperCase().equals("A")) && (!section.toUpperCase().equals("B")))){
			sucessful = false;
			try{throw new MyException("Invalid Section.");}
			catch(MyException e){System.out.println(e);}
		}
		
		if(p.numberException(phone)){
			sucessful = false;
			try{throw new MyException("Only Numbers are allowed for Phone Number.");}
			catch(MyException e){System.out.println(e);}
		}
		
		System.out.println();
		if (sucessful){
			System.out.println("Account has been created");
			System.out.println(name + " Welcome to Section " + section);
		}
		else
			System.out.println("Account Creation Failed.");
	}	
	
	public boolean characterException(String name){
		boolean check = false;
		for (int i=0; i<name.length(); i++){
			if (!(name.charAt(i) >= 65 && name.charAt(i) <= 90) &&
				!(name.charAt(i) >= 97 && name.charAt(i) <= 122)&&
				!(name.charAt(i) == 32)){
				check = true;
			}
		}
		return check;
	}
	public boolean numberException(String phone){
		boolean check = false;
		for (int i=0; i<phone.length(); i++){
			if (!((phone.charAt(i) >= 48) && (phone.charAt(i) <= 57))){
				check = true;
			}
		}
		return check;
	}
}

class MyException extends Exception{
	MyException(String a){
		super(a);
	}
}