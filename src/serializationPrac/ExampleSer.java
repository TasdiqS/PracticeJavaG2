package serializationPrac;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ExampleSer {
	
	public void serialization() {
	Person p = new Person("John", 26, "Indian", (short) 6);
	
	try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("per.ser"))){
		oos.writeObject(p);
	} catch(IOException e) {
		e.printStackTrace();
	}
	
	byte[] serializedArray = new ObjectMapper().writeValueAsBytes(p);
	}
	
}