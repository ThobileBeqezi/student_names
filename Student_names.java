package thobsapp.student_names;


/**
 *
 * @author Thobile
 */
public class Student_names {

    public static void main(String[] args) {
     //Parallel arrays for student names and test score
      String[] names = {"Thando", "Sipho", "Anele", "Bongani", "Lerato"};
        int[] scores = {78, 85, 90, 65, 88};

        // Display before sorting
        System.out.println("Before sorting:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + scores[i]);
        }

        // Sort by names using Bubble Sort
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - 1 - i; j++) {
                if (names[j].compareToIgnoreCase(names[j + 1]) > 0) {
                    // Swap names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;

                    // Swap scores to keep them matched
                    int tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;
                }
            }
        }

        // Display after sorting
        System.out.println("\nAfter sorting by name:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + scores[i]);
                
    }
}
