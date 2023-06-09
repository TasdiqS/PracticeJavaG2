package factory;

public class FactoryMain {

	public static void main(String[] args) {
/*exposing the class name which is being used here and also we need to statically
* give the class name here in the code and again recomplie the code and client can see the class name*/
		OS obj = new IOS();
//		obj.spec();
		
/*Insted we can create a class which will give us the object*/
		OSFactory osf = new OSFactory();
/* insted of creating obj of class directly call the osf obj*/
		OS obj1 = osf.getInstance("iPhone");
		obj1.spec();
	}

}
