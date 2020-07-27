package com.bit2020.chapter04.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;
		File file = new File("phone.txt");
		
		// error는 if문으로 하면 비교적 간단함
		if(!file.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		System.out.println("============파일정보==============");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length() + "bytes");
		long timestamp = file.lastModified();
		SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
		String lastUpdate = sdf.format(timestamp);
		System.out.println(lastUpdate);
		
		System.out.println("=============전화번호===============");
		
		// 기반 스트림(byte)
		try {
			FileInputStream fis = new FileInputStream(file);

			// 보조 스트림1(byte -> char)
			InputStreamReader isr  = new InputStreamReader(fis, "UTF-8");
			
			// 보조 스트립2(라인단위 입력)
			br = new BufferedReader(isr);
			
			// 처리
			String line = null;
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "\t");
				int index = 0;
				while(st.hasMoreTokens()) {
					String token = st.nextToken();
					if(index == 0) {
					System.out.print(token + ":"); // 이름
					} else if(index == 1) {
						System.out.println(token + "-");
					} else if(index == 2) {
						System.out.println(token + "-");
					} else {
						System.out.println(token);
					}
				System.out.println("");
				}
			}
		} catch (IOException e) {
			System.out.println("에러: " + e);
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
