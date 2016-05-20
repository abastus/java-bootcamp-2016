package topic2_TDD;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Blog b = new Blog();
		
		int i = 0;
		
		while (i < 10) {
			b.addEntry("Day "+ i, new Entry ((String) "Hola Mundo "+ i));
			i++;
		}
		
		try {
		b.removeEntry("Day 3"); //in case there is no "Day 3" entry, throws NullPointerException
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(b.showTenMostRecentEntries());
		
		// b.removeEntry("Day 3") throws NullPointerException;
	}

}
