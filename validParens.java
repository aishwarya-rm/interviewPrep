import java.util.*;
class validParens {
	public static void main(String[] args){
		System.out.println(validParens("(([[{}]]))"));
		System.out.println(validParens("(][("));
	}
	public static boolean validParens(String p){
		int length = p.length();
		if(length % 2 == 1){
			return false;
		}
		Stack<Character> hold = new Stack<Character>();
		for(int i = 0; i < length; i++){
			char curr = p.charAt(i);
			if(curr == '[' || curr == '{' || curr == '('){
				hold.push(curr);
			}
			else{
				if(hold.isEmpty()){
					return false;
				}
				char pop = hold.pop();
				if(curr == ')' && pop != '('){
					return false;
				}
				else if(curr == '}' && pop != '{'){
					return false;
				}
				else if(curr == ']' && pop != '['){
					return false;
				}
			}
		}
		return true;

	}
}