import java.util.ArrayList;
import java.util.List;

public class Team {

    public String teamName;
    public int score;

    List<Students> student = new ArrayList<>();
    List<Coach> ch = new ArrayList<>();
    Judge judge = new Judge("","","");

    public Team(String teamName){

        this.teamName = teamName;
        this.score = score;

    }
    public void addStudent(Students students){
        student.add(students);
    }

    public void addCoach(Coach coaches){
        ch.add(coaches);
    }

    public List<Coach> getCoach() {
        return ch;
    }

    public List<Students> getStudent() {
        return student;
    }

    public Judge getJudge() {
        return judge;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
