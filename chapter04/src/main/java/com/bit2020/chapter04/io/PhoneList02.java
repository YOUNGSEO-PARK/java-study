package com.bit2020.chapter04.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class PhoneList02 {
	public static void main(String[] args) {

		BufferedReader br = null;
		Scanner scanner = null;

		try {
			File file = new File("phone.txt");

			// error는 if문으로 하면 비교적 간단함
			if (!file.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				return;
			}
			System.out.println("============파일정보==============");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
			
			long timestamp = file.lastModified();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String lastUpdate = sdf.format(timestamp);
			System.out.println(lastUpdate);

			System.out.println("=============전화번호===============");
			scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String name = scanner.next();
				String phone1 = scanner.next();
				String phone2 = scanner.next();
				String phone3 = scanner.next();
				System.out.println(name + ": " +phone1 + "-" + phone2 + "-" + phone3);
			}
		} catch (IOException e) {
			System.out.println("에러: " + e);
		} finally {
			scanner.close();
		}
	}
}
