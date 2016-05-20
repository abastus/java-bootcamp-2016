package topic2_TDD;

import static org.junit.Assert.*;

import org.junit.*;

public class BlogTest {
	
	private Blog btest;
	private Entry post;
	
	@Test
	// checks if Day 1 post was added as an entry.
	public void newPost() {
		assertNotNull(btest.addEntry("Day 1", post)); // throws AssertionError if it is null (not added).
	}
	
	@Test
	//checks if deleted post is the "Day 3" post.
	public void deletePost() {
		assertEquals(post, btest.removeEntry("Day 3"));
	}
}
