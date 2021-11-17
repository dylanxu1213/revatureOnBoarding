package week11152021;

public class Week11152021 {
	public static int[][] squarePatch(int n)
	{
		if(n == 0)
		{
			System.out.println("[]");
			int[][] arr = {{}};
			return arr;
		}
		int[][] arr = new int[n][n];
		System.out.println("[");
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(j == 0)
				{
					System.out.print("[");
				}
				arr[i][j] = n;
				System.out.print(n);
				if(j != n-1)
				{
					System.out.print(", ");
				}
			}
			if(i != n-1)
			{
				System.out.println("],");
			}
			else
			{
				System.out.println("]");
			}
		}
		System.out.println("]");
		return arr;
	}
	
	public static boolean ascending(String str)
	{
		int i = 1;
		int temp;
		int j;
		int len;
		while(i<=str.length()/2)
		{
			temp = Integer.parseInt(str.substring(0, i));
			for(j = i; j<str.length(); j+=len)
			{
				len = String.valueOf(temp+1).length();
				if(j+len>str.length())
				{
					break;
				}
				if(++temp != Integer.parseInt(str.substring(j,j+len)))
				{
					break;
				}
			}
			if(j == str.length())
			{
				return true;
			}
			i++;
		}
		return false;
	}
}
