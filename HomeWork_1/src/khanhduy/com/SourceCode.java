package khanhduy.com;



public class SourceCode {
	///hàm tìm index của kí tự chữ và xuất ra  trong chuỗi con 
	static void abc (String a )
	{	
		
		int index = 0  ;
		for (int i = 0 ; i< a.length() ; i++)
		{
			if (Character.isLetter(a.charAt(i))) 
			{
				index = a.indexOf(a.charAt(i));
				break;
			}
			 
		}
		
		a ='-'+ a.substring(0,index);
		System.out.println(a);
	}
	// hàm tách chuỗi lớn thành các chuỗi con
	static void Handle(String a )
	{
		String kq = "";
		
		String [] b = a.split("-");
		
		for ( int i = 0 ; i < b.length ; i++)
		{
			//int j = 0 ; 
			String  temp = b[i] + " " ;
			if ( Character.isDigit(temp.charAt(0)) ) 
				{
					abc(temp) ;
				}
		
			
		}
		
		
		
		
	}
	public static void main(String[] args) {
		
		String str = "abc-5xyz-12k91--321n123";
		
		
		Handle(str);
		//System.out.println(kq);
		

	}

}
