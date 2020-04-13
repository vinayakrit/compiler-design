import java.io.BufferedReader;  
import java.io.FileReader;
import java.util.Scanner;  
import java.io.File;       
   class symbol
    {  
        public static void main(String[] args) throws Exception{
	String swalp=",";
	String col;
	String s2= "int";
	String extr, extr1;
	String[] array = new String[100];
	int count =0;
    Scanner sc = new Scanner(new File("file.txt"));
	System.out.println("----------------------------------------------------------");
	System.out.println("|| Type    ||  Symbol  ");
	System.out.println("----------------------------------------------------------");
String k= ";";
//while(k.equals(";")){
      while(sc.hasNext()){		//while_first
        String s = sc.next();
	//System.out.println(s);
        //.....


	if(s.equals(s2))
	{
	System.out.print("|| " + s);
	extr=sc.next();
	System.out.println("     || " + extr);
	 array[count] =  extr;
	String next;// = sc.next();
for(int i=0;i<5;i++){
next = sc.next();
if (next.equals(",") || next.equals("=") || next.equals("5") )//(swalp.equals(next)) // This will check for ;,= and if it is then move ahead .i.e is next is value
{}
else if(next.equals(";"))
{
col=";";
k=";";//symbol1();
break;
}
if (next.equals(",") || next.equals("=") || next.equals("+") || next.equals("5") )
{

}
else
{
for(int j=0;j<=count;j++){
if(array[j]==next){}
else{
			System.out.print("|| " + s);

	System.out.println("     || " + next);
	 array[count] =  next;
}/// else
}///for
}///else upper

}////for upper
}///if upper
/*
		if(s.equals(s2))
		{
		System.out.print("|| " + s);
		//System.out.println("     || " + sc.next());
		sc.next();
		System.out.println("     || " + sc.next());
		}  */

////// here char begin 
//***************************************    CHAR   ****************************************************
//***************************************           ****************************************************

		if(s.equals("char")){ /// if_char_first

System.out.print("|| " + s);
	extr=sc.next();
	System.out.println("    || " + extr);
	 array[count] =  extr;
	String next;// = sc.next();
for(int i=0;i<5;i++){
next = sc.next();
if (next.equals(",") || next.equals("=") || next.equals("5") )//(swalp.equals(next)) // This will check for ;,= and if it is then move ahead .i.e is next is value
{}
else if(next.equals(";"))
{
col=";";
k=";";//symbol1();
break;
}
if (next.equals(",") || next.equals("=") || next.equals("+") || next.equals("5") )
{

}
else
{
for(int j=0;j<=count;j++){
if(array[j]==next){}
else{
			System.out.print("|| " + s);

	System.out.println("    || " + next);
	 array[count] =  next;
}/// else
}///for
}///else upper

}


} /// if_char_first



/////////  char end 

//********************************    CHAR     END   *************************************************
//********************************                   *************************************************



//*********************************       STRING      *************************************************
//*********************************                   *************************************************

////// here string begin 

		if(s.equals("String")){ /// if_char_first

System.out.print("|| " + s);
	extr=sc.next();
	System.out.println("  || " + extr);
	 array[count] =  extr;
	String next;// = sc.next();
for(int i=0;i<5;i++){
next = sc.next();
if (next.equals(",") || next.equals("=") || next.equals("5") )//(swalp.equals(next)) // This will check for ;,= and if it is then move ahead .i.e is next is value
{}
else if(next.equals(";"))
{
col=";";
k=";";//symbol1();
break;
}
if (next.equals(",") || next.equals("=") || next.equals("+") || next.equals("5") )
{

}
else
{
for(int j=0;j<=count;j++){
if(array[j]==next){}
else{
			System.out.print("|| " + s);

	System.out.println("   || " + next);
	 array[count] =  next;
}/// else
}///for
}///else upper

}


} /// if_char_first



/////////  string end 

///****************************************   STRING   END   ***************************************************
///****************************************                  ***************************************************	
    } //while_first


System.out.println("----------------------------------------------------------");
}
}

















/*
import java.io.BufferedReader;  
import java.io.FileReader;
import java.util.Scanner;  
import java.io.File;       
   class symbol
    {  
        public static void main(String[] args) throws Exception{
    Scanner sc = new Scanner(new File("file.txt"));
	System.out.println("----------------------------------------------------------");
	System.out.println("|| Type    ||  Symbol  ");


	while(sc.hasNext()){
        String s = sc.next();
	//System.out.println(s);
        //.....
	String s2= "int";
	if(s.equals(s2))
	{
	System.out.print("|| " + s);
	System.out.println("     || " + sc.next());
	String semcol = sc.next();
		if(s.equals(s2))
		{
		System.out.print("|| " + s);
		System.out.println("     || " + sc.next());
		}
	}
    }
	System.out.println("----------------------------------------------------------");
}
}
*/
