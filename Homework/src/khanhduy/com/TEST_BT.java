package khanhduy.com;

public class TEST_BT {
	static String Xu_Ly_Khoang_Trang_Viet_Thuong (String a )
	{
		a = a.trim();
		a = a.toLowerCase() ;
		return a  ; 
	}
	
	static String Viet_Hoa(String a) 
	{
		// Cách 1 : 2 Loop 
		// Viet Hoa Chu Dau
		
//		for (int i = 1 ; i<a.length() ; i++) 
//		{
//			if (a.charAt(i) == ' ' && a.charAt(i+1) != ' '  )  
//				{
//					
//				//	a.charAt(i+1) =  Character.toUpperCase(a.charAt(i+1));
//				a = Character.toUpperCase(a.charAt(0)) + a.substring(1 , i+1 ) + Character.toUpperCase(a.charAt(i+1)) + a.substring(i+2);
//					
//				}
//		}
		// Xu Ly Cac Khoang Trang Con Lai
//		String c = "" + a.charAt(0); 
//		// trường hợp phủ của 2 khoảng trắng liền kề là :
//		// 1 .  2 chữ liền kề  
//		// 2.  1 khoảng trắng và 1 chữ 
//		for (int i = 0 ; i < a.length()-1 ; i++)
//		{
//			if (!(a.charAt(i) == ' '  && a.charAt(i+1) == ' ' ))
//			{
//				c = c +  a.charAt(i+1);
//			}
//			
//		}
		// Cách 2 : 1 Loop
		String [] b = a.split(" ") ; 
		String kq = "";
		for (int i = 0 ; i < b.length  ; )
		{
			// phải + " " vì nếu để b[i] ko thì sẽ có trường hợp c.length() = 0 => nên cộng thêm nhưng ko ảnh hưởng đến bài toán 
			
			// In ra c.length() là hiểu 
			String c = b[i] + " " ;
			// System.out.println(c.length());
			if (c.charAt(0) == ' ')  
				{
					 
					 i ++;
				}
			else 
			{
				c = Character.toUpperCase(c.charAt(0)) + c.substring(1 , c.length());
				kq = kq.concat(c);
				i ++ ;
			}
		}
		return kq ;
		
	}
	public static void main(String[] args) {
		String a = "         DON                  KHAnh   DUy       " ;
		System.out.println(a);
		String b = Xu_Ly_Khoang_Trang_Viet_Thuong(a);
		b = Viet_Hoa(b);
		System.out.println(b);

	}
}


