class  Table2
{
	public static void main(String[] args) 
	{   
		Table2.one(1);
	}
	public static void one(int k){
		int i=1;
		while(i<=10){
			k=1;
		     while(k<=10){
		     int j=i*k;
		     System.out.print(j+"\t");
		     k++;
		     }
			 System.out.println();
		i++;
	    }
	}
}
