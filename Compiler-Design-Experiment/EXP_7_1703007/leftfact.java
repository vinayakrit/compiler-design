// Vinayak Patil
// vinayakrit
// vinayakrit.github.io
// The program is made to remove lefta factoring using java lang. 
/*
Input : A -> aB|aC|aD
Output :
	A -> aA'
	A'-> B|C|D



*/


import java.util.Scanner;
import java.io.*;

class leftfact
{
public static void main(String args[])
{
int k, i, a=0, count=0, lim, back=0;
int[] array = new int[20];
String[] s =new String[20];

Scanner obj1 = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Production");

     String production = obj1.nextLine();
//System.out.println(production);
char f0= production.charAt(0);
char f1= production.charAt(5);
String sf0=String.valueOf(f0);
String sf1=String.valueOf(f1);
String alpha=sf1;
sf1 = sf1.concat(sf0);  
String first= sf1.concat("'");
//String s=String.valueOf(f0);  //conver char c to string
  //System.out.println(first); 
String sf2 = sf0.concat(" -> ");
String sf3 = sf2.concat(first);           

  //System.out.println(sf3); 

////upper



String str1="|";

/*       
System.out.println(production.charAt(0));
*/
//System.out.println(production.charAt(7));
//System.out.println(production.length());
int n=production.length();

for(i=0; i<n; i++)   // put every char in string production into new string s
{
s[i] = String.valueOf(production.charAt(i));
}

for(i=0; i<n; i++)  // get position of |
{
if(s[i].equals("|"))
{
//System.out.println("location is " + i);
k=i;
array[a]=k;
a=a+1;
count=count+1;
}
}
for(a=0; a<count;a++)
{
lim=array[a];
//System.out.println(array[a]);
lim=lim+1;
//System.out.println(s[lim]);
//System.out.println(alpha);
if(s[lim].equals(alpha))
{
//System.out.println("hurray");

}
else
{
back =1;
}
}
///
//upper

String line2= sf0.concat("' -> ");
String cmn=sf0.concat("'");
//System.out.println(line2);



String splt = production;
String[] parts = splt.split("->");
String part1 = parts[0]; 
String part2 = parts[1]; 




String spltstr= part2.replaceAll(alpha,"");
String lnew= line2.concat(spltstr);
System.out.println("Your answer is : "); 
if(back==0)
{
System.out.println(sf3); 
System.out.println(lnew);
}
else
{
System.out.println("No left factoring availble");
}

}
}
