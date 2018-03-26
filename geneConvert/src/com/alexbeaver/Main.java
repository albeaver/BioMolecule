package com.alexbeaver;

import com.alexbeaver.geneConversion;

public class Main {

    public static void main(String[] args) {
	// write your code here
        geneConversion converter = new geneConversion("gaggtgtgtgtgtagagagagagta");
        converter.genOpposite();
        System.out.println(converter.getInput());
        System.out.println(converter.getOutput());
    }
}
