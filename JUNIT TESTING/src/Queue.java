class Queue
   {
   public int maxSize;
   public long[] array;
   public int front;
   public int rear;
   public int n;

   public Queue(int s)          
      {
      maxSize = s;
      array = new long[maxSize];
      front = 0;
      rear = -1;
      n = 0;
      }

   public void insert(long ele)   
      {
      if(rear == maxSize-1)         
         rear = -1;
      array[++rear] = ele;         
      n++;                     
      }

   public long remove()         
      {
      long temp = array[front++]; 
      if(front == maxSize)           
         front = 0;
      n--;                      
      return temp;
      }

   public long peek()      
      {
      return array[front];
      }

   public boolean isEmpty()    
      {
      return (n==0);
      }

   public boolean isFull()     
      {
      return (n==maxSize);
      }

   public int size()         
      {
      return n;
      }

   }  

