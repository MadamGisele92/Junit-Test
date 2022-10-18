package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countITest {

	@Test
	void test() {
		WordCount test = new WordCount();
		int result = test.countI("C:\\Users\\gbrown62\\eclipse-workspace\\WordCount\\src\\Testing\\TheRaven.txt");
		assertEquals(32, result);
	}

}
