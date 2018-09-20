import static org.junit.Assert.*;

import org.junit.Test;

import main.IfFunctions;

public class IfFunctionsTest {

	@Test
	public void isEvenNumber1() {
		IfFunctions target = new IfFunctions();

		int tag = 2;

		boolean result = target.isEvenNumber(tag);
		boolean expext = true;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void isEvenNumber2() {
		IfFunctions target = new IfFunctions();

		int tag = 1;

		boolean result = target.isEvenNumber(tag);
		boolean expext = false;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void isEvenNumber3() {
		IfFunctions target = new IfFunctions();

		int tag = 0;

		boolean result = target.isEvenNumber(tag);
		boolean expext = false;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void pattern1() {
		IfFunctions target = new IfFunctions();

		int tag = 1;

		String result = target.pattern(tag);
		String expext = "一";//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void pattern2() {
		IfFunctions target = new IfFunctions();

		int tag = 2;

		String result = target.pattern(tag);
		String expext = "二";//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void pattern3() {
		IfFunctions target = new IfFunctions();

		int tag = 3;

		String result = target.pattern(tag);
		String expext = "三";//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void pattern4() {
		IfFunctions target = new IfFunctions();

		int tag = 0;

		String result = target.pattern(tag);
		String expext = "他";//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void pattern5() {
		IfFunctions target = new IfFunctions();

		int tag = 4;

		String result = target.pattern(tag);
		String expext = "他";//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void compareValues1() {
		IfFunctions target = new IfFunctions();

		int tag1 = 1;
		int tag2 = 1;

		int result = target.compareValues(tag1, tag2);
		int expext = 0;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void compareValues2() {
		IfFunctions target = new IfFunctions();

		int tag1 = 1;
		int tag2 = 2;

		int result = target.compareValues(tag1, tag2);
		int expext = 1;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void compareValues3() {
		IfFunctions target = new IfFunctions();

		int tag1 = 2;
		int tag2 = 1;

		int result = target.compareValues(tag1, tag2);
		int expext = -1;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void sumAllVauesCompareEvenNumbe1r() {
		IfFunctions target = new IfFunctions();

		int[] tag = { 1, 2, 3, 4 };

		int result = target.sumAllVauesCompareEvenNumber(tag);
		int expext = 1;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void sumAllVauesCompareEvenNumber2() {
		IfFunctions target = new IfFunctions();

		int[] tag = { 1, 2, 3, 4, 5 };

		int result = target.sumAllVauesCompareEvenNumber(tag);
		int expext = -1;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void sumAllVauesCompareEvenNumber3() {
		IfFunctions target = new IfFunctions();

		int[] tag = { 0, 0, 0, 0, 0 };

		int result = target.sumAllVauesCompareEvenNumber(tag);
		int expext = 0;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

}
