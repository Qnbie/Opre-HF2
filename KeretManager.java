import java.util.ArrayList;
import java.util.List;


/**
 * KeretManager
 */
public class KeretManager {

    private List<Keret> kerets = new ArrayList<Keret>();
    private int laphibaCNT = 0;
    private List<String> taskList = new ArrayList<String>();

    public KeretManager(){
        kerets.add(new Keret("A"));
        kerets.add(new Keret("B"));
        kerets.add(new Keret("C"));
        kerets.add(new Keret("D"));
    }

	public String[] run(String[] tasks) {
        
        for (String task : tasks) {
            Search(task);
        }
        
        return toStrings();
    }

    private void Search(String task) {
        boolean found = false;
        
        for (Keret keret : kerets) {
            found = keret.Found(task);
            if (found){
                keret.using();
                taskList.add("-");
                return;
            }
            if(keret.isEmpty()){
                keret.setTask(task);
                PutItBack();
                taskList.add(keret.getName());
                laphibaCNT++;
                return;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            if(kerets.get(0).getUsed()){
                PutItBack();
            }
            else if(!kerets.get(0).getUsed()){
                kerets.get(0).setTask(task);
                taskList.add(kerets.get(0).getName());
                PutItBack();
                laphibaCNT++;
                return;
            }
            if(i == 4){
                kerets.get(0).setTask(task);
                taskList.add(kerets.get(0).getName());
                PutItBack();
                laphibaCNT++;
                return;
            }
        }
    }

    private void PutItBack() {
        kerets.get(0).setUsed(false);
        kerets.add(kerets.remove(0));
    }

    private String[] toStrings() {
        String tmp = "";
        for (String task : taskList) {
            tmp += task;
        }
        String[] result = {tmp, String.valueOf(laphibaCNT)};
        return result;
    }

    
}