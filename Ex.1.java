import java.util.*;
class Ex.1{
public static void main(String agrs[]){
        int cno;
        String cname;
        double prev;
         double curr;
        double unit;
        int ctype;
        double amount;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the consumer no:");
    cno=sc.nextInt();
    sc.nextLine();
    System.out.println("Enter the consumer name:");
     cname=sc.nextLine();
     
     System.out.println("Enter the previous month reading:");
      prev=sc.nextDouble();
     sc.nextLine();
     System.out.println("Enter the current month reading:");
    curr =sc.nextInt();
     sc.nextLine();
     System.out.println("Enter the eb connection type(1.Domestic/n2.commercial)");
     ctype=sc.nextInt();
     unit=curr -prev;
     if(ctype==1||ctype==2)
         {
         if(unit>0 && unit<=100){
         System.out.println("EB bill:"+unit);
         }
         else if(unit>100 && unit<=200){
         amount=unit*4.5;
         System.out.println("EB bill:"+amount);
         }
         else if(unit>200 && unit<=500){
       
        System.out.println("EB bill:"+unit*4);
         }
         else if(unit>500){
        System.out.println("EB bill:"+unit*6);
         }
         else
         {
          if(unit>0 && unit<=100){
          System.out.println("EB bill:"+unit*2);
         }
         else if(unit>100 && unit<=200){
          amount=unit*4.5;
        System.out.println("EB bill:"+ amount);
         }
         else if(unit>200 && unit<=500){
      
            System.out.println("EB bill:"+unit*6);
         }
         else{
         System.out.println("EB bill:"+unit*7);
         
         }
         }
         System.out.println("consumer no:"+cno);
         System.out.println("consumer name:"+cname);
         System.out.println("consumer previous month reading:"+prev);
         System.out.println("consumer  current month reading :"+curr);
         System.out.println("consumer Eb Unit:"+unit);
         sc.close();
}
}
}
