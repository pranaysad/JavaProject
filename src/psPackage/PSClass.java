// Focus - Scalability
// oLogN algorithms - as the data increases the efficiency of the algorithm will increase
// oLogN algorithms behave better at higher 

// Fair - O(n)
// Good O(log n)

// http://bigocheatsheet.com
// Data Structures
// O(log n) - Binary Search Tree, Skip List, 
// O(n) - linked-list
// O(1) - hash table

// Best - B-Tree O(log(n))

// Sorting
// Tree Sort, Shell Sort, Cube Sort

// Multi-threading, Scalability, Telemetry, Reliability, Massive Data, BigData, Web Services, Machine Learning
// Leadership principles
// OOPS concepts (Data Abstraction, Encapsulation, Inheritance, Polymorphism)
// Loops / Data types
// String Handling
// Collection Framework
// Exception handling
// Generics
// Synchronization
// Serialization & De-serialization
// Concurrent collection
// JDBC
// Servlet
// JSP

// Spring (MVC, Core, JDBC, ORM, AOP)



package psPackage;

class Node
{
	int key;
	Node left, right;
	
	public Node(int item)
	{
		key = item;
		left = right = null;
	}
	
}

class BinaryTree {
	
	//Define the root node
	
	
}

public class PSClass {
	
	//Node root;

	//static PSClass tree = new PSClass();
	
	public static void main(String[] args) {
	
		/* New Tree */
		//PSClass tree = new PSClass();
		
		/* create root */
		//tree.root = new Node(1);
		//tree.root.key = 50;
		
		//tree.root.left = new Node(2);
		//tree.root.left.key = 25;
		
		//tree.root.right = new Node(3);
		//tree.root.right.key = 75;
		
		int[] arrValues= {1,2,3,4,5,0};
		
		Node tree = new Node(1);
		tree.left = new Node(2);
		tree.right = new Node(3);
		
		
		
		//int iRet = populateTree(arrValues);
		
		//int iRet = populateTree(tree);
		
		// TODO Auto-generated method stub
		//boolean iBool = roundrotate("abc","bca");
		//System.out.println(iBool);
		
	}
	
	
	static public int populateTree(Node tree, int[] arrValues, int iTer)
	{
		int iRet=0;
		
		while(arrValues[iTer] != 0)
		{
			tree = new Node(arrValues[iTer]);
			
			if (tree.left==null)
			{
				populateTree(tree.left,arrValues,iTer++);
			}
			
			if (tree.left==null)
			{
				populateTree(tree.right,arrValues,iTer++);
			}
			
		}
			
		return iRet;
	}
	
	//static public int populateTree(int[] arrValues)
	static public int populateTree(int[] arrValues)
	{	
		int iRet=0;
		
		int iter=0;
		
		//while(arrValues[iTer])
		{
			
			//tree.root.int = arrValues[iTer];
			
			
			
		}
		
		
		return iRet;
	}	
	
	public int[] traverse(PSClass tree)
	{
		
		int[] iNodeArr = null;
		
		if (tree)
		
		
		return iNodeArr;
		
	}
	
	PSClass()
	{
		root = null;
	}
	
	PSClass(int key)
	{
		root = new Node(key);
	}
	
	
	public static boolean roundrotate(String strOne, String strTwo)
	{
		boolean iBool=false;
		
		// abc
		// 012
		
		// Duplicate array
		// abcabc
		
		// Now just go 3 ahead 
		// abc
		// bca
		// abc
		// Is strTwo equal to any of the above choices?
		
		String strOneDouble = strOne + strOne;
		
		System.out.println(strOne);
		System.out.println(strTwo);
		
		System.out.println(strOneDouble);
				
		System.out.println("----");
		
		//strOneDouble.toCharArray();
		
		//	abc.length()=3
		//	abcabc.length()=6
		//	abc bca cab
		
		// Algorithm O(n)
		for(int i=0;i<(strOneDouble.length()/2);i++)
		{	
			
			String strSub = strOneDouble.substring(i,i+strOne.length());
			
			System.out.println(i);
			System.out.println(strSub);
			
			if (strTwo.equals(strSub))
			{
				iBool=true;
			}
		}
					
		return iBool;
		
	}
	
	public static boolean FAILroundrotate(String strOne, String strTwo)
	{			
		int iRotate = 0;
		
		// 97 98 99
		// 98 99 97
		// 99 97 98
			
		// abc, bca, cab
		// 012  120  201
		// 012  012  012
		
		// 0 --> 2  =  2
		// 1 --> 0  = -1
		// 2 --> 1  = -1
		
		// 0 --> 1 =  1
		// 1 --> 2 =  1
		// 2 --> 0 = -2
				
		int i=0;
			
		for (i=0; i<strOne.length(); i++)
		{		
			System.out.println(i);
			System.out.println(strOne.charAt(i));
			System.out.println(strTwo.indexOf(strOne.charAt(i)));
			iRotate = iRotate + i - strTwo.indexOf(strOne.charAt(i));
			System.out.println(iRotate);
			System.out.println("------");
		}			
		System.out.println(iRotate);
		return (iRotate==0);
		
	}

}


