
public class app2 {
	
	public static void main(String[] args) {

        Stack stack = new Stack(5);
        stack.Push(5);
        stack.Push(4);
        stack.Push(3);
        stack.Push(2);
        stack.Push(1);
        stack.Pop();
        stack.Pop();
        stack.Push(6);
        while( !stack.isEmpty() )    
        {                           
        long n = stack.Pop();  
        System.out.print(n);
        System.out.print(" ");
       
        }
}
}
