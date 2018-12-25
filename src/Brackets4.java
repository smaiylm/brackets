import java.util.ArrayList;

//I have used Array Lists (array based structure) because I thought this could return the most organized solution, as well as it is the most flexible data structure with lots of different operations. 
//Having an array-based data structure, I can keep track of the potential errors that may occur, as well as I can access any element in the arraylist(element 0, or element 5, for example), and remove it if necessary(for example). Overall, I believe that using an array based structure provides with more flexibility.


public class Brackets4 {

	
	
	
	
	
	
	
	
	public static boolean isBalanced(String input) {
		
		boolean isBalanced = true;
		/*
		boolean open = true;    //Test for following cases: (){}[]<>
		boolean match = true;
		boolean pairIsFound = false; 
		boolean openType = false;
		boolean closedType = false;
		*/
		
		char open1 = '(';
		char open2 = '{';
		char open3 = '[';
		char open4 = '<';
		
		
		char closed1 = ')';
		char closed2 = '}';
		char closed3 = ']';
		char closed4 = '>';
		ArrayList<Character> balancer = new ArrayList<Character>();
		
		
		
		
		for(int i = 0; i< input.length(); i++){
			
			char k = input.charAt(i);
			
			balancer.add(k);    //"splitting" the string into characters, adding them into the ArrayList
			
			
			
			
		}
		
		
		
		
		
	//Starting the check	
		
		
		
	if (input.length() % 2 != 0)		{ //first check - if the size of input (or the size of the ArrayList) int is even
		
		isBalanced = false;
		
	
		
	}
		if(input.length() % 2 == 0){ //passing the even number check
			
	

	for(int k = 0; k+1< balancer.size(); k++){ //Walk through the ArrayList length times
		
		
		//second check (for all 4 types) - if an open and a closed one are next to each other, remove them
		
		while (balancer.size() != 0){
		
		if(balancer.get(k) == open1 && balancer.get(k+1) == closed1){
			balancer.remove(k);
			balancer.remove(k);   //after removing, the ArrayList shifts to the left
		}
		}
		while (balancer.size() != 0){
		if(balancer.get(k) == open2 && balancer.get(k+1) == closed2){
			balancer.remove(k);
			balancer.remove(k);   //after removing, the ArrayList shifts to the left
		}
		}
		while (balancer.size() != 0){
		if(balancer.get(k) == open3 && balancer.get(k+1) == closed3){
			balancer.remove(k);
			balancer.remove(k);   //after removing, the ArrayList shifts to the left
		}
		}
		while (balancer.size() != 0){
		if(balancer.get(k) == open4 && balancer.get(k+1) == closed4){
			balancer.remove(k);
			balancer.remove(k);   //after removing, the ArrayList shifts to the left
		}
		}
		
		isBalanced = true;
		
		
		// Now, what if there is nesting (such as "{()}" )? - for this, we will run through it while  the size is more than 0.
		
		
		
		
	} //first for loop closed
	
	int p=0;
	while(p<balancer.size()){  //if there is nesting, it keeps checking
		
		//second check (for all 4 types) - if an open and a closed one are next to each other, remove them - balanced
		while (balancer.size() != 0){
				if(balancer.get(p) == open1 && balancer.get(p+1) == closed1){
					balancer.remove(p);
					balancer.remove(p);   //after removing, the ArrayList shifts to the left, so this removes the next one
				}
		}
		while (balancer.size() != 0){
				if(balancer.get(p) == open2 && balancer.get(p+1) == closed2){
					balancer.remove(p);
					balancer.remove(p);   //after removing, the ArrayList shifts to the left
				}
		}
		while (balancer.size() != 0){
				if(balancer.get(p) == open3 && balancer.get(p+1) == closed3){
					balancer.remove(p);
					balancer.remove(p);   //after removing, the ArrayList shifts to the left
				}
		}
		while (balancer.size() != 0){
				if(balancer.get(p) == open4 && balancer.get(p+1) == closed4){
					balancer.remove(p);
					balancer.remove(p);   //after removing, the ArrayList shifts to the left
				}
		}
				
				p++;
				
				
	}//while loop
	
	
	
	
	
	
	
	 
	//LAST CHECK - if there is anything left in the ArrayList
		
	
		} //the even number checks ended
	
	
		if(balancer.size() != 0)
		{
			
			isBalanced = false;
			
		}
		else{
			isBalanced = true;
		}
	
	
	
	
		
		
		
		
		
		
		
	
	
	
	 
	
	// For testing - print out the ArrayList   System.out.println(balancer);
	return isBalanced;   //if the length is an odd number - in other words, one item will be left unclosed (unbalanced)
	
		
	}//end of method
	
	
	
	
	
	
	public static void main(String[] args)
	{
	
		String input = "";  //test case - user input needed
		System.out.print(isBalanced(input));
	
	
	}
	
	
	
	
	
	
}