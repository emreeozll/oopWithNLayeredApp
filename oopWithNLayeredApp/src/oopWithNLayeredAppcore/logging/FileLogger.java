package oopWithNLayeredAppcore.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Dosya loglandi:" + data);
		
	}

	
}
