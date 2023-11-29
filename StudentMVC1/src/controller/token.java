package controller;

import java.util.StringTokenizer;

public class token {
	
	public void tokenSeperate(Input ip) {
	StringTokenizer tokenizer = new StringTokenizer(ip.inputstring);
	while(tokenizer.hasMoreTokens());
	System.out.print(tokenizer.nextToken() + " ");
	}
}
