package team.banana.plan;

public class Plan {

    private int id;
    private String content;

    public Plan(int id, String content){
        this.id = id;
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
