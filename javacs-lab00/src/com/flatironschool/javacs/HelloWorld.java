package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        // I won't work!
        String javaVerS = System.getProperty("java.specification.version");
        Double javaVerD = Double.parseDouble(javaVerS);
        return javaVerD;
    }

    public static void main(String[] args) {
	    // you can test the output of getVersion() here
	    System.out.println(getVersion());
    }
}
