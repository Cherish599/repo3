package com.itheima.demo;

import org.junit.Assert;
import org.junit.Test;

//注： 测试方法要求：不能有返回值，不能有参数
public class TestCalc {
	@Test
	public void test1() {
		System.out.println("aaaaaaaaa");
	}

	@Test
	public void test2() {
		System.out.println("bbbbbbbbbb");
	}

	@Test
	public void test3() {
		Calc calc = new Calc();
		Assert.assertEquals(8, calc.add(3, 5));
	}

	public void test4() {
		Calc calc = new Calc();
		// Assert.assertEquals(3, calc.div(10, 3), 0.4);
		Assert.assertEquals(3, calc.div(10, 3), 0.4);
	}
}
