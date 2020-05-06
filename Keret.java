/**
 * Keret
 */
public class Keret {

    private String name;
    private String actualTask = "";
    private boolean used;

	public Keret(String string) {
        name = string;
    }

	public boolean Found(String task) {
        return actualTask.equals(task);
    }

	public void using() {
       used = true; 
    }

	public void setTask(String task) {
        actualTask = task;
	}

	public boolean getUsed() {
		return used;
	}

	public void setUsed(boolean b) {
        used = b;
    }

	public boolean isEmpty() {
		return actualTask.equals("");
	}

	public String getName() {
		return name;
	}

    
}