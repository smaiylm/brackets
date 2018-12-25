import java.util.ArrayList;

//I have used Array Lists (array based structure) because I thought this is the most organized solution.
//This is because every time I test my cases, I can neatly see (through arrays) what elements are left. In other words, array representation is very suitable to my solution.

public class Balancer2 {

	
	
	
	
	
	
	
	
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
			
	while(balancer.size() != 0){
	for(int j = 0; j+1< balancer.size(); j++){
	for(int k = 0; k+1< balancer.size(); k++){ //Walk through the ArrayList length times
		
		//second check (for all 4 types) - if an open and a closed one are next to each other, remove them
		if(balancer.get(k) == open1 && balancer.get(k+1) == closed1){
			balancer.remove(k);
			balancer.remove(k);   //after removing, the ArrayList shifts to the left
		}
		if(balancer.get(k) == open2 && balancer.get(k+1) == closed2){
			balancer.remove(k);
			balancer.remove(k);   //after removing, the ArrayList shifts to the left
		}
		if(balancer.get(k) == open3 && balancer.get(k+1) == closed3){
			balancer.remove(k);
			balancer.remove(k);   //after removing, the ArrayList shifts to the left
		}
		if(balancer.get(k) == open4 && balancer.get(k+1) == closed4){
			balancer.remove(k);
			balancer.remove(k);   //after removing, the ArrayList shifts to the left
		}
		
		
		isBalanced = true;
		
		
		// Now, what if there is nesting (such as "{()}" )? - for this, we are already running through the array list input.length() times (to make sure we found all the nestings) - first time, it deletes one nesting, second time - bigger nesting, and etc. until the ArrayList is empty, or otherwise is not balanced    
		
		
		
		
	} //first for loop closed
	
	
	
	} //second for loop closed
	
	} //while loop closed
	//LAST CHECK - if there is anything left in the ArrayList
		if(balancer.size() != 0)
		{
			
			isBalanced = false;
			
		}
	
	
		} //the even number checks ended
	
	
	
	
	
	//we cannot get the size of an ArrayList; However, we can check if the first (or any item), is a character, then we still have some elements left.
	
		
		
		
		
		
		
		
	
	
	
	 
	
	System.out.println(balancer);
	return isBalanced;   //if the length is an odd number - in other words, one item will be left unclosed (unbalanced)
	
		
	}//end of method
	
	
	
	
	
	
	public static void main(String[] args)
	{
	//error with the size of the ArrayList - after deleting, the size shrinks and is less than input.length()
		String input = "{()}";  //test case - user input needed
		System.out.print(isBalanced(input));
	
	
	}
	
	
	
	
	
	
}
