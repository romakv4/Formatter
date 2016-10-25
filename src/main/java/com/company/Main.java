package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        com.company.Reader read = new com.company.Reader();

        com.company.Format format = new com.company.Format();
        System.out.print(format.format(read.read()));

    }
}
