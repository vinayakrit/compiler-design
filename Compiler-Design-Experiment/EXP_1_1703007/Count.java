    import java.io.BufferedReader;  
    import java.io.FileReader;  
       
   class Count
    {  
        public static void main(String[] args) throws Exception {  
            String line;  
            int count = 0, space=0;
char ch;  
              
           
            FileReader file = new FileReader("file.txt");  
            BufferedReader br = new BufferedReader(file);  
                  
           
            while((line = br.readLine()) != null) {  
               
                String words[] = line.split(" ");  
               
                count = count + words.length; 
		space= count -1;

 
            }  
  
              
            System.out.println("Number of words present in given file: " + count);  
	    System.out.println("Number of spaces present in given file: " + space);
            br.close();  
           /* FileReader fil = new FileReader("file.txt");  
            BufferedReader b = new BufferedReader(fil);  
String st; 
int i,c1=0,c2=0;
String str;
  while ((i = fil.read()) != -1) {
if ((char)i=='{')
{
  System.out.println((char)i); 
c1=c1+1;

}
if ((char)i=='}')
{
 System.out.println((char)i); 
c2=c2+1; 
 
}
  } 
System.out.println(c1); 
System.out.println(c2);
if(c1==c2)
{
 System.out.println("correct"); 
}
else
{
if(c1>c2){ 
int n=c1-c2;
 System.out.println("right parenthisis missed by "+ n +"times"); }
else
{
int n=c2-c1;
 System.out.println("left parenthisis missed by "+ n +"times"); }

}*/
        }  
    }  
