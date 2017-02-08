public class A{
    public static void main(String[] args){
        for(int i=1;i<=10;i++)
	{
	     for(int j=1;j<=10;j++)
	     {
             if(i==1||i==10||j==i||j==10-i+1)
             System.out.print("*");
	     else System.out.print(" ");
             }
	System.out.println();
	}
       
      for(int k=0;k<10;k++)
      {
        for(int l=0;l<k;l++)
       {
            System.out.print("*");   
       }
          System.out.println();
      }
}


}
