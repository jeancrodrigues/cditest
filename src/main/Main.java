package main;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {

	public static void main(String[] args) {
		WeldContainer weld = new Weld().initialize();
		MyClass objeto = weld.instance().select(MyClass.class).get();
		System.out.println(objeto);
		
	}
}
