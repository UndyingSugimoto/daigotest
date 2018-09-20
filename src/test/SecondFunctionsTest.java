import static org.junit.Assert.*;

import org.junit.Test;

import main.SecondFunctions;

public class SecondFunctionsTest {

	@Test
	void plusStringsTest() {
		SecondFunctions target = new SecondFunctions();
		String result =  target.plusStrings("左", "右");
		String expext = "左右";//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

}
