package topic2_TDD;

public class Entry {
	private String post;

	public Entry(String post) {
		super();
		this.post = post;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Entry [post=" + post + "]";
	}
}
