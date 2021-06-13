
public class Stackll {
public class Node
{
	char data;
	Node next;
	Node(char data)
	{
		this.data=data;
	}
}
Node root=null;
boolean isEmpty()
{
	if(root==null)
	{
		System.out.println("Empty Stack");
		return true;
	}
	else
	{
		System.out.println("Stack has data");
	return false;
	}
}
char peek()
{
	if(root==null)
		System.out.println("Stack is empty");
	else
		System.out.println(root.data);
	return 'a';
}
char push(char data)
{
	Node newn=new Node(data);
	if(root==null)
	{
		root=newn;
	}
	else
	{
		Node temp=root;
		root=newn;
		root.next=temp;
	}
	return 'a';
}
char pop()
{
	if(root==null)
		System.out.println("Stack is Empty");
	else
	{
		root=root.next;
	}
	return 'a';
}
char display()
{
	if(root==null)
	{
		System.out.println("Stack is Empty");
	}
	else
	{
	Node temp=root;
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}
	}
	return 'a';
}
public static void main(String [] ars)
{
	Stackll s=new Stackll();
	s.push('a');
	s.push('b');
	s.push('c');
	s.display();
	s.pop();
	s.display();
	s.peek();
	s.pop();
	s.display();
	s.pop();
	s.display();
}
}
