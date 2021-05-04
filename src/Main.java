/*
Created by EC1946673 - David McClung
Assessment H17135
Well Jorge, this did challenge me for sure or it has shown I am challenged.........
Note to self - practice more java.
 */

public class Main {

        public static void main(String[] args) {

                try {

                                System.out.println("Welcome to world skills competition!\n ");
                                System.out.println("Registering Teams!\n");

                                Ladder ladder = new Ladder();

                                                ladder.addTeam("Edinburgh College");
                                                ladder.addCoach(1, "Edinburgh College", "John", "Granton", "0111");
                                                ladder.addStudent("Edinburgh College", "David ", "Westbank ", "0122", 1946671, "Networking ");
                                                ladder.addStudent("Edinburgh College", "Kimon ", "Sighthill ", "0133 ", 196432, "Software Development ");
                                                ladder.addStudent("Edinburgh College", "Matthew ", "Corstorphine ", "0144 ", 19433, "Web Design ");
                                                ladder.addStudent("Edinburgh College", "Dylan ", "Sighthill ", "0155 ", 19414, "Networking ");

                                                ladder.addTeam("Fife College");
                                                ladder.addCoach(2, "Fife College", "Iro", "Fire Nation", "0211");
                                                ladder.addStudent("Fife College", "Aang ", "Air Temple ", "0222 ", 296435, "Software Development");
                                                ladder.addStudent("Fife College", "Kitara ", "Water Tribe ", "0233 ", 296436, "Networking");
                                                ladder.addStudent("Fife College", "Sokka ", "Water Tribe ", "0244 ", 296437, "Networking");
                                                ladder.addStudent("Fife College", "Zuko ", "Fire Nation ", "0255 ", 296438, "Web Design");

                                                ladder.addTeam("Aberdeen Univeristy");
                                                ladder.addCoach(3, "Aberdeen Univeristy", "Homer", "Onion Way", "0311");
                                                ladder.addStudent("Aberdeen Univeristy", "Maggie ", " ", "0322 ", 396439, "Web Design");
                                                ladder.addStudent("Aberdeen Univeristy", "Lisa ", "Jebidiah Lane", "0333 ", 3964310, "Networking");
                                                ladder.addStudent("Aberdeen Univeristy", "Bart ", "Evergreen Terrace ", "0344 ", 3964311, "Software Development");
                                                ladder.addStudent("Aberdeen Univeristy", "Marge ", "Sighthill ", "0355 ", 3964312, "Software Development");

                                                ladder.print();

                                                System.out.println("Teams registered!\n");

                                                ladder.judgeRegister();

                                                System.out.println("Time to award teams the points\n ");

                                                ladder.awardScores();


                                 } catch (Exception e) {
                                         System.out.println("Error! ");
                         }

                 }
        }