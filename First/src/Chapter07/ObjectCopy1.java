package Chapter07;

public class ObjectCopy1 {
	public static void main(String[] args)
	{
		Book[] arr1 = new Book[3];
		Book[] arr2 = new Book[3];
		
		arr1[0] = new Book("슈독","나이키");
		arr1[1] = new Book("코스모스","칼세이건");
		arr1[2] = new Book("규칙없음","넷플릭스");
		System.arraycopy(arr1, 0, arr2, 0, 3);
		
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i].showInfo();
		}
	}

}
