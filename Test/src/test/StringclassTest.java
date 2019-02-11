package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class StringclassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Raj";
    String s2 = "Raj";
    String s3 = new String("Raj");
    
    System.out.println(s1 == s3);
    System.out.println(s1.equals(s3));
	}

}
