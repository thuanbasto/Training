package io;

import java.io.ObjectInputStream;

public class test2 {
	public static void main(String[] args) {
		try (ObjectInputStream in1 = null) {
			System.out.println("a");
			try (ObjectInputStream in2 = null) {
				System.out.println("b");
				throw new Exception("abc");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
