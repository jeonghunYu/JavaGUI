package day05;

import java.awt.GraphicsEnvironment;

public class FontListner {
	public static void main(String[] args) {
		String[] font_list;
		GraphicsEnvironment g = GraphicsEnvironment.getLocalGraphicsEnvironment();
		font_list = g.getAvailableFontFamilyNames();
		for(int i=0; i<font_list.length; i++) {
			System.out.println(font_list[i]);
		}
	}
}
