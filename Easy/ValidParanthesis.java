package Easy;
import java.util.*;
class Solution {
	public boolean isValid(String s) {
		try {
			if(s.length() == 0) {
				return false;
            }
			if(s.length() % 2 != 0) {
				return false;
            }
			HashMap<Character, Character> symbols = new HashMap<>();
            symbols.put('[', ']');
            symbols.put('(', ')');
            symbols.put('{', '}');
            
            ArrayList<Character> arrayList = new ArrayList<>();
            arrayList.add('[');
            arrayList.add('(');
            arrayList.add('{');
            Stack<Character>  stack = new Stack<>();
            for(int i = 0; i < s.length(); i++) {	
            		if(arrayList.contains(s.charAt(i))) {
            			stack.push(s.charAt(i));
            		} else {
            			if (symbols.get(stack.peek()) == s.charAt(i)) {
            				stack.pop();
            			} else {
            				return false;
            			}
            		}
            }
            
            if (stack.size() == 0 ) {
            		return true;
            } else {
            		return false;
            }
            

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}


	}
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isValid("(("));
	}
}