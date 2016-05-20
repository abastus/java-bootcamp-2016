package topic2_TDD;

import java.util.TreeMap;

public class Blog {
	
	private TreeMap<String, Entry> tm;

	public Blog() { }
	
	public Blog(TreeMap<String, Entry> tm) {
		super();
		this.tm = tm;
	}

	public TreeMap<String, Entry> getTm() {
		return tm;
	}

	public void setTm(TreeMap<String, Entry> tm) {
		this.tm = tm;
	}
	
	public Entry addEntry(String date, Entry entry) {
		return tm.put(date, entry);
	}
	
	public Entry removeEntry(String date) {
		return tm.remove(date);
	}

	public String showTenMostRecentEntries() {
		
		int i;
		String res = null;
		
		TreeMap<String, Entry> dtm = (TreeMap<String, Entry>) this.getTm().descendingMap();
		
		for (i=0; i<=10 ; i++)
		{
			res += dtm.get(i).getPost();
		}
		
		return res;
	}
}
