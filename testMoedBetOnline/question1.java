import unit4.collectionsLib.*;
public class question1
{

	public static String secret(Stack<Character> s1,Stack<Integer> s2)
	{
		if (s2.isEmpty())
			{
			if (s1.isEmpty())
				return "";
			else
				return "error";
			}
		else{
			if(s1.isEmpty())
				return "error";
			else{
				
				String s = "";
				int x = s2.pop();
				int i = 0;
				while((i < x) && (!s1.isEmpty())){
					s += s1.pop();
					i++;
				}
				
				if( i < x)
					return "error";
				return (s + " " + secret(s1,s2));
				
			}
			
			
		}
		
		
		
		
	}
	
	public static void main(String args[]){
		Stack<Character> s1 = new Stack<Character>();
		s1.push('Y');
		s1.push('T');
		s1.push('I');
		s1.push('C');
		s1.push('M');
		s1.push('I');
		s1.push('A');
		s1.push('T');
		s1.push('A');
		s1.push('V');
		s1.push('I');
		s1.push('G');
		s1.push('E');
		s1.push('R');
		s1.push('A');
		s1.push('E');
		s1.push('W');
		
		Stack<Integer> s2 = new Stack<Integer>();
		s2.push(4); s2.push(8); s2.push(3); s2.push(2);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		
		System.out.println(secret(s1,s2));
		
	}
}
