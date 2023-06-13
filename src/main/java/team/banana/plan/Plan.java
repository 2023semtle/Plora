package team.banana.plan;

public class Plan {

    private int id;
    private String content;

    private boolean isComplete = false;

    public Plan(int id, String content, boolean isComplete){
        this.id = id;
        this.content = content;
        this.isComplete = isComplete;
    }

    public Plan(int id, String content){
        this.id = id;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
