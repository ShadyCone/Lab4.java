import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner wee = new Scanner(System.in);
        int array[] = new int[100];
        int prevrray[] = new int[100];
        int position = 0, a, b;
        int n=0;
        int i=0;
        System.out.println("Enter the amount of elements that you want to be in an array ");
        b=wee.nextInt();
        System.out.println("Enter " + b + " Element:");

        for (a=0 ; a < b ; a++ )
        {array [a] = wee.nextInt();
         prevrray[a]= array [a];   
            
        }
        
        System.out.println("Now, please enter the number you want to delete ");
        position= wee.nextInt();
        
        
        
        for(a=0; a<b; a++)
        {   if (array[a]==position)
            {   
                n=a;
                i+=1;
                for ( a = n; a<b-i; a++ )
                { 
                  array[a] = array [a+1];
                
                }
                
                if (n==a)
                {break;}
                else if(n!=0)   
                {a=n-i;}
                
                else 
                {a=n-1;}
            }
            
        }
        System.out.print("The final array is : ");

        for (a=0 ; a<b-i; a++ )
        {System.out.print(" "+array[a]);}
        
        System.out.print("\nThe previous one was: ");
        for (a=0 ; a<b; a++ )
        {System.out.print(" "+prevrray[a]);}
        
    }
}
