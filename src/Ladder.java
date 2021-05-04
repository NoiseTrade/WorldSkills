import java.util.*;
import java.util.stream.Collectors;

public class Ladder {

    String judgeName;
    int score;

    HashMap<String, Team> teams = new LinkedHashMap<>();

    public void addTeam(String teamName) {
        Team team = new Team(teamName);
        teams.put(teamName, team);
    }

    public void addStudent(String teamName, String name, String address, String telephone, int studentID, String specialisation) {
        Students students = new Students(teamName, name, address, telephone, studentID, specialisation);
        Team team = teams.get(teamName);
        team.addStudent(students);
    }

    public void addCoach(int coachID, String teamName, String name, String address, String telephone) {
        Coach coach = new Coach(coachID, teamName, name, address, telephone);
        Team team = teams.get(teamName);
        team.addCoach(coach);
    }

    public void print() throws InterruptedException {
        for (Map.Entry<String, Team> entry : teams.entrySet()) {
            Team team = entry.getValue();

            System.out.println("Team Name : " + team.getTeamName());
            System.out.println("Coach : " + team.getCoach().toString());
            System.out.println("Students : " + team.getStudent().toString());
            System.out.println("Current score = " + team.getScore() + "\n");

            Thread.sleep(3000);
        }

    }

    public void judgeRegister() {

        Judge judge = new Judge("", "", "");
        Scanner in = new Scanner(System.in);

        System.out.println("Please register judge,\nEnter name:");

        judgeName = judge.setName(in.nextLine());

        System.out.println("Judge Registered\nWelcome Judge " + judge.getName());

    }

    public void awardScores() {

        for (Map.Entry<String, Team> entry : teams.entrySet()) {
            Scanner in = new Scanner(System.in);

            Team team = entry.getValue();
            System.out.println("Judge " + judgeName + " award points to " + team.getTeamName() + "\n");

            score = team.setScore(in.nextInt());

            if (score == 0) {
                System.out.println("Cannot award 0 points ");
                System.exit(0);

            } else if (score > 0) {

                System.out.println(score + " points awarded to " + team.getTeamName() +"\n");
            }
        }

        for (Map.Entry<String, Team> entry : teams.entrySet()) {
            Team team = entry.getValue();
            System.out.print("Current Scores : " + team.getTeamName() + ": " + team.getScore() + " points\n");

            if(team.score == Math.max(team.getScore(), score)){
                System.out.println("\n" + team.getTeamName() + " is the winner with " + team.score + " points");
                System.out.println("Congratulations!");
                break;
            }
        }

    } //end of awardScores

}





