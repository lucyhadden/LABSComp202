package paper;

import java.util.ArrayList;

public class paperChild {

    public static void main(String[] args) {
        ArrayList<paper> papersCompleteLists = new ArrayList<paper>();

        paper paperOne = new paper("COSC 202", "Software Development", 18);
        paper paperTwo = new paper("Math 130", "Intro to maths", 18);
        paper paperThree = new paper("PHIL106", "Intro to Radical philosophy", 18);

        papersCompleteLists.add(paperOne);
        papersCompleteLists.add(paperTwo);
        papersCompleteLists.add(paperThree);

        ArrayList<paper> papersNotCompletedLists = new ArrayList<paper>();

        paper paperOneNC = new paper("COSC 201", "Algorithms and data structures", 18);
        paper paperTwoNC = new paper("Math 140", "Intro to maths2", 18);
        paper paperThreeNc = new paper("PHIL335", "Why be moral?", 18);

        papersNotCompletedLists.add(paperOneNC);
        papersNotCompletedLists.add(paperTwoNC);
        papersNotCompletedLists.add(paperThreeNc);


        // output papers already completed

        System.out.println("\n== Papers Already Completed ==\n");
        for (paper i : papersCompleteLists) {
            System.out.print(i.getCode() + " - ");
            System.out.print(i.getTitle() + " - ");
            System.out.print(i.getPoints() + "");
            System.out.println();
        }
        ;

        // output papers not completed

        System.out.println("\n== Papers Currently Enrolled In ==\n");
        for (paper i : papersNotCompletedLists) {
            System.out.print(i.getCode() + " - ");
            System.out.print(i.getTitle() + " - ");
            System.out.print(i.getPoints() + "");
            System.out.println();
        }
        ;
    }
}
