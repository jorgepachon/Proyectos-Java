package For;

public class Twitterizer {

	public String shorten(String longPost) {
		String shortPost = "";
		for (int i = 0; i < longPost.length(); i++) {
			if (!"aeiouAEIOU".contains(longPost.substring(i, i + 1)))
				;
			{
				shortPost = shortPost + longPost.substring(i, i + 1);
			}
		}
		return shortPost;
	}

}
