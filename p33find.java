import java.util.*;
class find{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
          int n=input.nextInt();
          int arr[][]=new int[n][n];
          int count=0;  
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                arr[i][j]=input.nextInt();
                    if(arr[i][j]==1)
                    {
                        count++;
                    }
                }
                
            } 
            
                System.out.print(count);
            
        
    }
}
