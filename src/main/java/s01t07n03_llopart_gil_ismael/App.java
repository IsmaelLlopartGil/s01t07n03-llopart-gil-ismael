package s01t07n03_llopart_gil_ismael;

import java.lang.annotation.Annotation;

public class App {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void launch() {	
		Class aClass = Person.class;
		Annotation annotation = aClass.getAnnotation(SerializableJSON.class);

		if(annotation instanceof SerializableJSON){
			SerializableJSON myAnnotation = (SerializableJSON) annotation;
		    System.out.println("Path: " + myAnnotation.path());
		}
	}

	public static void main(String[] args) {
		App app=new App();
		app.launch();
	}
}
