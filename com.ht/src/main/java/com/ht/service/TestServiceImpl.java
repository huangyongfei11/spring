package com.ht.service;

import org.springframework.stereotype.Component;

/**
 * @author K1081221
 * @version 2019/10/20
 * @description:
 * @modified:
 */
@Component
public class TestServiceImpl implements TestService {
	@Override
	public void test() {
		System.out.println(" ======  test ===========");
	}

	@Override
	public void test2() {
		System.out.println(" ------------------------");
	}
}
