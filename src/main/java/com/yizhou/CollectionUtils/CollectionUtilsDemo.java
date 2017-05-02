package com.yizhou.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.commons.collections.CollectionUtils;
import org.junit.Test;

public class CollectionUtilsDemo {
	@Test
	public void isEmptyDemo() {
		System.out.println(CollectionUtils.isEmpty(null)); //true
		System.out.println(CollectionUtils.isEmpty(new ArrayList())); //true
		System.out.println(CollectionUtils.isEmpty(Arrays.asList(new String[]{"a", "b"}))); //false
	}
}
