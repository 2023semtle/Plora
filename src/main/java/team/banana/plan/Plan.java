package team.banana.plan;

public class Plan {
    private String content;

    private boolean isComplete = false;

    public Plan(String content, boolean isComplete){
        this.content = content;
        this.isComplete = isComplete;
    }

    public Plan(String content){
        this.content = content;
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
