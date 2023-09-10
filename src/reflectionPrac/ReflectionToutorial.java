package reflectionPrac;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionToutorial {

	public static void main(String[] args)
			throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {

		Cat cat = new Cat("Stella", 2);
		System.out.println("before changing " + cat.getName());

		// get all the fields in cat class
		Field[] catFields = cat.getClass().getDeclaredFields();

		for (Field f : catFields) {
			if (f.getName().equals("name")) {
				f.setAccessible(true);
				f.set(cat, "Jimmy McGill");
			}
		}
		System.out.println("after changing " + cat.getName());

		Method[] meth = cat.getClass().getDeclaredMethods();
		for (Method m : meth) {
			if (m.getName().equals("privateVoidMethod")) {
				m.setAccessible(true);
				m.invoke(cat);
			}

		}
	}

}
