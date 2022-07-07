/*  Given an array A of size N, your task is to do some operations, i.e., search an element, insert an element, and delete an element by completing the functions. Also, all functions should return a boolean value.

Note: In delete operation return true even if element is not present.

Example:

Input:
5
2 4 1 0 6
1 2 2 0
Output:
1 1 1
Your Task:
Since this is a function problem, you only need to complete the provided functions.

Constraints:
1 <= T <= 100
1 <= N <= 100
0 <= Ai <= 1000

 */




package Arrays;

import java.util.Arrays;
import java.util.Scanner;
class operations{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[10000];
			Arrays.fill(a,-1);
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int x = sc.nextInt();
			int y = sc.nextInt();
			int yi = sc.nextInt();
			int z = sc.nextInt();
			GfG g = new GfG();
			boolean b = g.searchEle(a,x);
			if(b==true)
				System.out.print("1 ");
			else
				System.out.print("0 ");
			b = g.insertEle(a,y,yi);
			if(b){
			if(a[yi]==y)
				System.out.print("1 ");
			else
				System.out.print("0 ");
			}
			else
				System.out.print("0 ");
			b = g.deleteEle(a,z);
			if(b){
			if(!g.searchEle(a,z))
				System.out.println("1 ");
			else
				System.out.println("0 ");
			}
			else
				System.out.println("0 ");
		}
	}
}// } Driver Code Ends


/*Complete the function(s) below*/
class GfG
{		
	public boolean searchEle(int a[],int x)
    {
		for(int i = 0;i < a.length;i++){
		    if(a[i] == x) return true;
		}
		return false;
	}
	public boolean insertEle(int a[],int y,int yi)
    {
        boolean isInsert = false;
        for(int i = 0;i < a.length;i ++){
            if(i == yi){
                int temp = a[i];
                a[i] = y;
                a[i + 1] = temp;
                isInsert = true;
            }
        }
        return isInsert;
	}
	public boolean deleteEle(int a[],int z)
    {
		boolean isDelete = true;
		if(searchEle(a,z)){
		    for(int i = 0;i<a.length;i++){
		        if(a[i] == z){
		            isDelete = true;
		            a[i] = a[i + 1];
		        } 
		    }
		}
		return isDelete;
	}
}

