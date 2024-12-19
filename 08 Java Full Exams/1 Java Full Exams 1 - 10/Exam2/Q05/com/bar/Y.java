//in file /com/bar/Y.java
package com.bar;

import com.foo.*;

public class Y{
	public static void main(String[] args){
		X x = new X();
		x.apply(x.LOGICID);// Access LOGICID through the instance x
	}
}