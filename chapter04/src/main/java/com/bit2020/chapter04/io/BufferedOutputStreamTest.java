package com.bit2020.chapter04.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		
		try {
			// 주 스트림
			FileOutputStream fis = new FileOutputStream("test.txt");
			
			// 보조스트림은 기반 스트림(주 스트림)에 꽂음, 직접 소스에 못 꽂음
			bos = new BufferedOutputStream(fis);
			
			for(int i = 'a' ; i <= 'z'; i++) { // a == 97, z == 122
				bos.write(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 열 수 없습니다" + e);
		} catch (IOException e) {
			System.out.println("에러:" + e);
		} finally {
			try {
				if(bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				System.out.println("에러:" + e);
			
			}
		}
	}

}
