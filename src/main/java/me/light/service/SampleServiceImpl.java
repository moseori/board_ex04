package me.light.service;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

	@Override
	public Integer doAdd(String str1, String str2) throws Exception {
		System.out.println("doAdd 메소드 실행");
		for (int i = 0; i < 20000000; i++) { }
		return Integer.parseInt(str1) + Integer.parseInt(str2);
	}

}
