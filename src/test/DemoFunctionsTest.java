package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.DemoFunctions;

public class DemoFunctionsTest {

	@Test
	public void sumTest() {
		DemoFunctions target = new DemoFunctions();
		// 1 + 2
		int result =  target.sum(1, 2);
		int expext = 3;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}
	@Test
	public void sumTestMax() {
		DemoFunctions target = new DemoFunctions();
		// 1 + 2
		int result =  target.sum(5000, 5000);
		int expext = 9999;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void minusTest() {
		DemoFunctions target = new DemoFunctions();
		int result =  target.minus(2, 1);
		int expext = 1;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}
	@Test
	public void minusTestMin() {
		DemoFunctions target = new DemoFunctions();
		int result =  target.minus(1, 2);
		// 0をしたまわる場合は、０にする必要があります
		int expext = 0;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void divideTest() {
		DemoFunctions target = new DemoFunctions();
		int result =  target.divide(6, 3);
		int expext = 2;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}
	@Test
	public void divideTest2() {
		DemoFunctions target = new DemoFunctions();
		int result =  target.divide(2, 5);
		// 0をしたまわる場合は、０にする必要があります
		int expext = 0;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}

	@Test
	public void multiTest() {
		DemoFunctions target = new DemoFunctions();
		int result =  target.multi(6, 3);
		int expext = 18;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}
	@Test
	public void multiTest2() {
		DemoFunctions target = new DemoFunctions();
		int result =  target.multi(2, 5);
		// 0をしたまわる場合は、０にする必要があります
		int expext = 10;//期待される値

		// この二つは一緒ですか？
		assertEquals(expext, result);//期待される値、実際の値

	}


}
