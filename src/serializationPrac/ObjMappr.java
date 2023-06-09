//package serializationPrac;
//
//import com.fasterxml.jackson;
//
//public class ObjMappr {
//
//	public static void main(String[] args) {
//
//		
//
//		// ...
//
//		// Serialize an array of strings into a JSON string
//		String[] array = {"one", "two", "three"};
//
//		// Store the JSON string in the database
//
//		// Later, retrieve the JSON string from the database
//
//		// Deserialize the JSON string into an array of strings
//		String[] newArray = new ObjectMapper().readValue(json, String[].class);
//
//		// ...
//
//		// Serialize an array of strings into a byte array
//		String[] array = {"one", "two", "three"};
//		byte[] serializedArray = new ObjectMapper().writeValueAsBytes(array);
//
//		// Store the serialized byte array in the database
//
//		// Later, retrieve the serialized byte array from the database
//
//		// Deserialize the byte array into an array of strings
//		String[] newArray = new ObjectMapper().readValue(serializedArray, String[].class);
//
//	}
//
//}
