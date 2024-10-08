package com.bptn.course._14a_big_fri_coding_2;

public class Triangle {
	
	public int perimeterCalculator(int a, int b, int c) {

		return a + b + c;
	}

	
	public int areaCalculator(int b, int h) {
		return (b * h) / 2;
	}

	public static void main(String[] args) {
		Triangle object = new Triangle();

		int a = 7;
		int b = 10;
		int c = 35;

		int perimeter = object.perimeterCalculator(a, b, c);
		int area = object.areaCalculator(7, 10);

		System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);

	}

}
