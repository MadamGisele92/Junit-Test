package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countITest {

	@Test
	void test() {
		WordCount test = new WordCount();
		int result = test.countI("Once upon a midnight dreary, while I pondered, weak and weary,Over many a quaint and curious volume of forgotten lore— While I nodded, nearly napping, suddenly there came a tapping,	As of some one gently rapping, rapping at my chamber door. Tis some visiter I muttered, tapping at my chamber door— Only this and nothing more. Ah, distinctly I remember it was in the bleak December, And each separate dying ember wrought its ghost upon the floor. Eagerly I wished the morrow;—vainly I had sought to borrow 	From my books surcease of sorrow—sorrow for the lost Lenore— For the rare and radiant maiden whom the angels name Lenore- Nameless here for evermore.");
		assertEquals(6, result);
	}

}
