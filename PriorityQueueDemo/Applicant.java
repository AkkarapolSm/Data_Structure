package PriorityQueueDemo;

public class Applicant {
    private String name;
    private int score;

    
    @Override
    public String toString() {
        return "applicant [name=" + name + ", score=" + score + "]";
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getScore() {
        return score;
    }


    public void setScore(int score) {
        this.score = score;
    }


    public Applicant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    
}
