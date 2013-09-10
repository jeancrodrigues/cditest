package main;

import javax.annotation.ManagedBean;
import javax.inject.Inject;


public class MyClass {
	@Inject
	MyOtherClass outra;
	
	@Override
	public String toString() {
		return outra.toString();
	}
}
