package com.bit2020.chapter04.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
		// 기반 스트림(키보드에서는 표준입력, stdin, System.in 객체)
		
		// 보조 스트림 1(기반 스트림에서 들어오는 byte|byte|byte| -> char)
		InputStreamReader isr = new InputStreamReader(System.in, "utf-8");
		
		// 보조 스트림 2(char|char|char|\n -> "charcharchar")
		br = new BufferedReader(isr);
		
		String line = null;
		while((line = br.readLine()) != null){
			
			if("exit".equals(line)) {
				break;
			}
			
			System.out.println(line);
		}
		
		} catch(UnsupportedEncodingException e) {
			System.out.println("에러:" + e);
		} catch (IOException e) {
			System.out.println("에러:" + e);
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
