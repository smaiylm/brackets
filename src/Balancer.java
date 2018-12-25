//Defence of choice: I chose AStack because





public class Balancer {
	
	
	

	public static boolean isBalanced(String input) {
		
		
		
			
			AStack balancer = new AStack();
			//Testing
			
		
		
	//remove if a pair is found
	boolean open = true;    //Test for following cases: (){}[]<>
	boolean match = true;
	boolean pairIsFound = false; 
	boolean openType = false;
	boolean closedType = false;
	
	
	
	
	String open1 = "(";
	String open2 = "{";
	String open3 = "[";
	String open4 = "<";
	
	
	String closed1 = ")";
    String closed2 = "}";
    String closed3 = "]";
    String closed4 = ">";
    
			
			
	
	
	
	//push every item in the string
	
	for(int i =0; i< input.length(); i++){   //putting the input items into AStack
		
		char k = input.charAt(i);      //character by character
				
				
				
				balancer.push(k);  //pushing into the 
		
		
	}
	
	
	
	
	
	
	
	
	
if(balancer.length() % 2 == 0){  //if the size of the stack is an odd number, it will not work out at at all.
	
	
	for(int i = 0; i<input.length();i++){  //runs through all elements of the string "input"
	
	
	if(input.charAt(0) == "(" || (input.charAt(0) == "{" || (input.charAt(0) == "(" || ){
		AStack.push(input);
		}
		
		
		
	if (input.charAt(i) == open1 && input.charAt(i+1) == closed1 {
		
		
	
	
	
	if(charAt(i) == k && charAt(i+1) == k){
		pairIsFound = true;
	}
	
	
	}
	
	//If pair is found, pairIsFound = true;
	
	
	
	
	if (pairIsFound = true){
		balancer.push(); //"it" is the pair you want to delete
	}
	
	
	
	//remove if  the pair is found
	
	if(input.charAt() == balancer.topValue()){ //resolve - if the closed bracket matches the one left
		
	}
			
	isBalanced = false;
	
	
	}
	
	
	
	
	if(balanced.length() > 0){    //if the stack is not yet empty, then it is not balanced
		isBalanced = false;
	}
	
	
	
}


   else{
   
   return false;
    
  }
}
}



	
	}
	public static void main(String[] args){      //main method has to be outside the boolean method
		String input = "pizza";     //The input tester - boolean
		System.out.print(isBalanced(input));
		//return pairIsFound;
		
		
		}
	
}