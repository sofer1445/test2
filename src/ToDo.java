public class ToDo {
    private String jobDescription;
    private String name;
    private boolean isDone;

    public ToDo(String jobDescription, String name , boolean isDone){
        this.jobDescription = jobDescription;
        this.name = name;
        this.isDone = isDone;
    }
    public String getJobDescription(){
        return jobDescription;
    }
    public String getName(){
        return name;
    }
    public boolean isDone(){
        return isDone;
    }
    public void setJobDescription(String jobDescription){
        this.jobDescription = jobDescription;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}

