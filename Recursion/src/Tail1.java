
public class Tail1
	{

		public static void main(String[] args)
			{
				System.out.println(mystery(11));

			}
		public static int mystery(int n)
		{
			if(n==1)
				{
					return 1;
				}
			else
				{
					return n + mystery(n-2);
				}
		}

	}
