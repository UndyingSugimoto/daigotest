package test;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import main.ArrayFunctions;

class ArrayFunctionsTest {

	@Test
	public void connectStringArrayTes1t() {
		ArrayFunctions target = new ArrayFunctions();

		String[] fst = {"あ","い","う","え","お"};

		String result =  target.connectStringArray(fst);
		String expext = "あいうえお";//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}
	@Test
	public void connectStringArrayTest2() {
		ArrayFunctions target = new ArrayFunctions();

		String[] fst = {"あ","い","う","え","お"};

		String result =  target.connectStringArray(fst);
		String expext = "あ";//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void returnFirstObjectTest() {
		ArrayFunctions target = new ArrayFunctions();

		String[] fst = {"あ","い","う","え","お"};

		String result =  target.returnFirstObject(fst);
		String expext = "あ";//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}
	@Test
	public void returnFirstObjectTest2() {
		ArrayFunctions target = new ArrayFunctions();

		String[] fst = {"A","B","C","D","E"};

		String result =  target.returnFirstObject(fst);
		String expext = "E";//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void returnLastObjectTest1() {
		ArrayFunctions target = new ArrayFunctions();

		String[] fst = {"あ","い","う","え","お"};

		String result =  target.returnLastObject(fst);
		String expext = "お";//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}
	@Test
	public void returnLastObjectTest2() {
		ArrayFunctions target = new ArrayFunctions();

		String[] fst = {"A","B","C","D","E"};

		String result =  target.returnLastObject(fst);
		String expext = "E";//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void returnConnectFirstAndLastObjectTest1() {
		ArrayFunctions target = new ArrayFunctions();

		String[] fst = {"あ","い","う","え","お"};

		String result =  target.returnConnectFirstAndLastObject(fst);
		String expext = "あお";//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void returnConnectFirstAndLastObjectTest2() {
		ArrayFunctions target = new ArrayFunctions();

		String[] fst = {"A","B","C","D","E"};

		String result =  target.returnConnectFirstAndLastObject(fst);
		String expext = "AE";//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void returnSumAllObject1() {
		ArrayFunctions target = new ArrayFunctions();

		int[] fst = {1,2,3,4,5};

		int result =  target.returnSumAllObject(fst);
		int expext = 15;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void returnSumAllObject2() {
		ArrayFunctions target = new ArrayFunctions();

		int[] fst = {1,1,1,1,1};

		int result =  target.returnSumAllObject(fst);
		int expext = 5;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void returnEvenNumber1() {
		ArrayFunctions target = new ArrayFunctions();

		int[] fst = {1,2,3,4,5};

		int[] result =  target.returnEvenNumber(fst);
		int[] expext = {2,4};//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void returnEvenNumber2() {
		ArrayFunctions target = new ArrayFunctions();

		int[] fst = {6,7,8,9,10};

		int[] result =  target.returnEvenNumber(fst);
		int[] expext = {6,8,10};//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}


}
