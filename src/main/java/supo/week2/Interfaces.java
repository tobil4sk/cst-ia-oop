package supo.week2;

interface Copyable<T> {
	public T copy();	
}

abstract class Log {
	protected String data;
	
	public abstract void addLine(String line);
	
	public void clear() {
		data = ""; 
	}
}

class DebugLog extends Log implements Copyable<DebugLog> {
	public DebugLog() {
		data = "";
	}
	
	private DebugLog(String text) {
		this.data = text;
	}
	
	public void addLine(String line) {
		data += "[DEBUG] " + line + "\n";
	}
	
	public DebugLog copy() {
		return new DebugLog(data);
	}
}

public class Interfaces {
	
	static void addIntroLines(Log log) {
		log.addLine("Welcome");
		log.addLine("Starting up the system...");
	}
	
	static void start() {
		DebugLog log = new DebugLog();
		addIntroLines(log);
	}
	
	

}
