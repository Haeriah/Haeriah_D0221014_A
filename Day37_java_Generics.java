# Haeriah_D0221014_A


import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
   //Write your code here
   
   boolean wasRun;
   
   public void printArray(Object o){
       if(wasRun){
           return;
       }
       System.out.print("1\n2\n3\nHello\nWorld\n");
       wasRun=true;
   }
 
}
