import java.util.*;

public class Ladder {

    HashMap<String, Team> teams = new LinkedHashMap<String, Team>();

    public void addTeam(String teamName) {
        Team team = new Team(teamName);
        teams.put(teamName, team);
    }

    public void addStudent(String teamName,String name,String address,String telephone, int studentID, String specialisation) {
        Students students = new Students(teamName,name,address,telephone,studentID,specialisation);
        Team team = teams.get(teamName);
        team.addStudent(students);
    }
    public void addCoach(String teamName,String name, String address, String telephone){
        Coach coach = new Coach(teamName,name,address,telephone);
        Team team = teams.get(teamName);
        team.addCoach(coach);
    }

    public void addJudge(String name,String address, String telephone){
        Judge judge = new Judge(name,address,telephone);

    }

    public void awardScore(int score){

    }

    public void print() {
        for (Map.Entry<String, Team> entry : teams.entrySet()) {
            Team team = entry.getValue();

            System.out.println("Team Name : " + team.getTeamName());
            System.out.println("Coach : " + team.getCoach().toString());
            System.out.println("Students : " + team.getStudent().toString());
            System.out.println("Current score = " + team.getScore() +"\n");
        }
    }

}