package com.yizhou.StringUtils;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class StringUtilsDemo {
	
	/**
	 * 例3: 判断是否为空(empty)
	 */
	@Test
	public void isEmptyDemo() {
		System.out.println(StringUtils.isEmpty(null)); //true
		System.out.println(StringUtils.isEmpty(""));   //true
		System.out.println(StringUtils.isEmpty(" "));  //false
	}
	
	/**
	 * 例4: 判断是否不为空(empty)
	 */
	@Test
	public void isNotEmpty() {
		System.out.println(StringUtils.isNotEmpty(null)); //false
		System.out.println(StringUtils.isNotEmpty(""));   //false
		System.out.println(StringUtils.isNotEmpty(" "));  //true
	}
	
	/**
	 * 例6: 判断是否是数字
	 */
	@Test
	public void isNumeric() {
		System.out.println(StringUtils.isNumeric("ab"));  //false
		System.out.println(StringUtils.isNumeric("CD"));  //false
		System.out.println(StringUtils.isNumeric("efGH"));//false
		System.out.println(StringUtils.isNumeric("12"));  //true
		System.out.println(StringUtils.isNumeric("12ab"));//false
	}
}
