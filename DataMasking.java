import java.util.*;


public class DataMasking
{
    public static String[] name= {"Raman ","Amitab","Arun "};
    public static String[] country= {"Australia ","  USA    "," France   "};
    public static String[] card={"3344-5566-7444-6754","3344-9999-7554-6757","4844-5589-2589-6894"};
    public static double[] salary={50000,60000, 9000};
    public static void Simple()
    {
        System.out.println("Name"+"  "+"Country"+"  "+"     Salary"+"   Card" +"       ");
        for(int i=0;i<3;i++)
        {
            System.out.println(name[i]+" "+country[i]+" "+salary[i]+" "+card[i]);
        }
    }
    public static void encrypt()
    {
        
        for(int j=0;j<3;j++)
        {
            String str="";
            char[] ch=name[j].toCharArray();
            for(char c:ch)
            {
            c+=5;
            str=str+c;
            
            }
            name[j]=str;
            str="";
        }
        for(int i=0;i<3;i++)
        {
            String str="";
            char[] ch=country[i].toCharArray();
            for(char c:ch)
            {
            c+=5;
            str=str+c;
            }
            country[i]=str;
            str="";
        }
    
    }
   public static void numberdata()
   {
    for(int i=0;i<3;i++)
    {
        salary[i]=salary[i]/10+50;
    }
   }
   public static void hash()
   {
    String m="XXXX-XXXX-XXXX-";
    for(int i=0;i<3;i++)
    {
        String str=card[i].substring(15);
        str=m+str;
        
        card[i]=str;
        System.out.println(card[i]);
    }
   }
    public static void scrambling()
    {
        for(int i=0;i<3;i++)
        {
            String str="";
           
                char ch[]=card[i].toCharArray();
                for(char chr:ch)
                 str=chr+str;
            
            card[i]=str;
           

        }
    }
    public static void swap(String name[],int i,int j)
    {
        String temp=name[i];
        name[i]=name[j];
        name[j]=temp;
    }
    public static void suffling()
    {
        for(int i=0;i+1<3;i++)
        {
            swap(name,i,i+1);
        }
        for(int i=0;i<3;i++)
        {
            System.out.println(name[i]+" "+country[i]+" "+card[i]);
        }
          
    }
    
    public static void main(String args[])
    {
        
        //encrypt();
        //Simple();
        //suffling();
        //numberdata();
     
        //scrambling();
        //Simple()
        hash();
        Simple();
    }
}
