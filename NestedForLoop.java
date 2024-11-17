package loopingstatments;

public class NestedForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)//Outer forloop
		{
			for(int j=5;j<=6;j++)//Inner forloop
			{
				System.out.println(i + " " + j);
			}
		}


	}

}
