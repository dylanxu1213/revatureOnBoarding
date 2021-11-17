package week11152021;

public class Week11152021 {
	public static int[][] squarePatch(int n)
	{
		if(n == 0)
		{
			int[][] arr = {{}};
			return arr;
		}
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				arr[i][j] = n;
			}
		}
		return arr;
	}
	
	public static boolean ascending(String str)
	{
		int i = 1;
		int temp;
		int j;
		while(i<=str.length()/2)
		{
			if(str.length()%i==0)
			{
				temp = Integer.parseInt(str.substring(0, i));
				for(j = i; j<str.length(); j+=i)
				{
					if(temp+1 == Integer.parseInt(str.substring(j, j+i)))
					{
						temp++;
					}
					else
					{
						break;
					}
				}
				if(j == str.length())
				{
					return true;
				}
			}
			i++;
		}
		return false;
	}
}
