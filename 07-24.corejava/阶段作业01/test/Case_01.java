package test;

public class Case_01 {
	
	public static void main(String[] args) {
		
		
		rectangle(10 , 10 );
		
	}
	
	
	public static void rectangle(int m,int n)    
    {    
        for (int x=0;x<n;x++)    
        {    
            for(int y=0;y<m;y++)    
            {    
             
                if(x==0||x==n-1||y==0||y==m-1)       
                    System.out.print("* ");    
                else     
                    System.out.print("   ");    
            }    
            //»»ÐÐ    
            System.out.println();    
        }    
    }    

}
