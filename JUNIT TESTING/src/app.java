
class app
   {
   public static void main(String[] args)
      {
      Queue q = new Queue(10);  

      q.insert(1);           
     q.insert(2);
     q.insert(3);
     q.insert(4);

     q.remove();              
     q.remove();              
  
      q.insert(5);            
    q.insert(6);           
    q.insert(7);
   

      while( !q.isEmpty() )    
         {                           
         long n = q.remove();  
         System.out.print(n);
         System.out.print(" ");
        
         }
      }  
   }  
