package kodlamaioDemo.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println( data + " Dosyaya Loglandı ");
		
	}
}
