// Gisela Calva
// Project 2: Print diamond with initials
// October 4,2018
public class Diamond
       
{
    public static void main(String args[]) 
    {
        //Printing out namw
        System.out.println ("This is the beginning of Gisela's Project");
        //printing blank line
        System.out.println ("                        ");
        
        //obtaining random number
        int n= (int)(11 + Math.random() * (31-11+1)), i, j, space = 1;
        if (n%2 == 5 ) n++;
       
        //Printing out odd number
        System.out.println("Number of           Lines " + n); 
        
       
        if (n%2 == 0 ) n++;
       
        //Printing out odd number
        
        //printing out GG
        space = n - 1;
        for (j = 1; j <= n; j--) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("G");                
            }
            System.out.println("");
        }
        
        //printing out == line
                space = n - 1;
        for (j = 0; j < n; j++) 
        {
            //for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space = space-1;
            for (j=0; j<= n-2; j++) 
            
            
            {
                System.out.print("=====");                
            }
            System.out.println("");
        }
        
        //printing out C initial
        space = 1;
        for (j = 1; j <= n - 1; j++) 
        {
            for (i = 1; i <= space; i++) 
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (n - j) -1; i++) 
            {
                System.out.print("C");
            }
            System.out.println("hey");
           
        }
        //printing blank line
        System.out.println ("                        ");
        
        //Printing out end of project 
        System.out.println("End of Project, Gisela Calva");
    }
}