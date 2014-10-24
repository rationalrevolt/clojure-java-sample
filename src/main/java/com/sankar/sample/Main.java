package com.sankar.sample;

import clojure.java.api.Clojure;
import clojure.lang.IFn;
import clojure.lang.Symbol;

public class Main {
	
	private static IFn REQUIRE = Clojure.var("clojure.core/require");
	
    public static void main( String[] args ) {
    	require("com.sankar.core");
    	
    	IFn sayHello = Clojure.var("com.sankar.core/say-hello");
    	
    	sayHello.invoke("Sankar");
    }
    
    private static void require(String lib) {
    	REQUIRE.invoke(Symbol.create(lib));
    }
    
}
