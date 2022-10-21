public class Test6 {
    public static void main(String[] args) {
        ResumeManager resumeManager = new ResumeManager();
        Resume r1 = new Resume("A",20,new Photo(16));
        Resume r2 = new Resume("B",21,new Photo(64));
        resumeManager.saveResume("r1", r1);
        resumeManager.saveResume("r2", r2);
        ((Resume)resumeManager.cloneResume("r1")).print();
        ((Resume)resumeManager.cloneResume("r2")).print();
        //--------------------------------------------
        Resume r3 = (Resume) resumeManager.copyResume("r1");
        r3.setPhoto(32);
        r3.print();
        r1.print();
        // -------------------------------------------
        Resume r4 = (Resume) resumeManager.cloneResume("r2");
        r4.setPhoto(32);
        r4.print();
        r2.print();
    }
}
