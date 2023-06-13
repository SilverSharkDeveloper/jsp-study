package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		int[] arInt = { 1, 2, 3 };
		String[] arStr = { "sxcwesdf", "xwefsfxs", "xgwefsfx", "qeqwegx" };
		List<Integer> intList = new ArrayList<Integer>();
		List<Integer> intList2 = new ArrayList<>();
		List<String> strList = new ArrayList<>();
		StringBuilder sb = new StringBuilder();

	}

	 public String solution(String s) {
	        
	       
	       return Arrays.stream(s.split(" ")).map(i -> Integer.parseInt(i)).mapToInt(i -> i).max().getAsInt() + " " + 
	        Arrays.stream(s.split(" ")).map(i -> Integer.parseInt(i)).mapToInt(i -> i).min().getAsInt();
	    }

}
