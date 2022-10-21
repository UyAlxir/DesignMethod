import java.util.HashMap;

public class ResumeManager {
    private HashMap<String,Resume> resumes;
    public ResumeManager(){
        resumes = new HashMap<String,Resume>();
    }

    public void saveResume(String name,Resume resume){
        resumes.put(name,resume);
    }

    public Product copyResume(String name){
        return resumes.get(name).deepclone();
    }

    public Product cloneResume(String name){
        return resumes.get(name).clone();
    }
}
