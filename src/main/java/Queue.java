

public class Queue<T>
{
    //be sure that your attributes are protected, so subclasses can use them
	Node front;
	Node back;

	public class Node
	{
		T val;
		Node next;
		public Node(T val, Node next)
		{
			this.val = val;
			this.next = next;
		}
		
	}
	
   public Queue()
   {
	   this.front = null;
	   this.back = null;
   }


    /**Adds val to the end of the queue
     */
   public void push(T val)
   {
	   Node x = new Node(val, null);
	   if (isEmpty()) {
		   front = x;
	   }
	   back = x;
   }


    /**
       removes and returns the oldest value in the queue
       throws QueueUnderFlowException if the queue is empty
     */
   public T pop()
   {
	  // System.out.println(front.val);
	   T temp;
       if(isEmpty()) {
    	   throw new QueueUnderFlowException();
       }
       else {
	       temp = front.val;
	       front = front.next;
	       return temp;
       }
       
   }    


    /**
      returns true if the queue is empty
     */

   public boolean isEmpty()
   {
	   if(front == null && back == null) {
		   return true;
	   }
       return false;
   }




}
