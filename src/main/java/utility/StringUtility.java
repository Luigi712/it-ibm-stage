package utility;


import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class StringUtility {
	
	
	public static <T> T jsonToObject(String filename, Class<T> classe) {

	    return new Gson().fromJson(filename,classe);
		}
	
	
	
	public static <T> String objectToXML(T object) {
		try {
			JAXBContext context = JAXBContext.newInstance(object.getClass());
		    Marshaller mar= context.createMarshaller();
		    mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		    
		    StringWriter stringWriter = new StringWriter();
		    mar.marshal(object,stringWriter);

	        return stringWriter.toString();
		}
		catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Errore generico"); // 
    }
	}
	
	public static <T> String objectToJson(T object) {
		Gson gson = new Gson();	
		JsonElement jsonElement = gson.toJsonTree(object);
		JsonObject jsonObject = jsonElement.getAsJsonObject();
		String jsonString = gson.toJson(jsonObject);
		return jsonString;
	}
}
