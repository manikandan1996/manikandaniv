import java.util.*;
class least
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int arr1[]=new int[100];
  int i=0,l=0;
  while(a>0)
  {
   arr1[i]=a%10;
   a/=10;
   i++;
   l++;
  }
  int[] arr2=new int[l];
  for(int ii=0;ii<arr2.length;ii++)
   arr2[ii]=arr1[ii];
  int aa=s.nextInt();
  int b=s.nextInt();
  int c=s.nextInt();
  for(int ii=0;ii<arr2.length;ii++)
  {
   if(arr1[ii]==aa || arr1[ii]==b ||arr1[ii]==c)
   {
     arr2[ii]=0;
     if(arr1[ii]==aa)
     aa=-1; 
    if(arr1[ii]==b)
     b=-1;
    if(arr1[ii]==c)
     c=-1;  
   }
  }
  int bb=arr2[0];
 if(bb==aa || bb==b || bb==c)
   arr2[0]=0;
  int arr3[]=new int[l];
  int m=0;
  StringBuffer sb=new StringBuffer();
  Arrays.sort(arr2);
  for(int ii=3;ii<arr2.length;ii++)
  {
   arr3[m]=arr2[ii];
   sb.append(arr2[ii]);
   m++;
  }
System.out.print(sb);
  }
} 
