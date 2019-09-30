import java.io.IOException;

public class TravellingSalesmanImplementorDemo {
    public static void main(String... args) {
        try {
            TravellingSalesmanImplementor travellingSalesmanImplementor = new TravellingSalesmanImplementor(15, "/Users/sangeetagupta/IdeaProjects/JavaAssignments/src/com/domain/sangeetagupta/algorithm_assignment/tsp.txt");
            travellingSalesmanImplementor.generateMinimumDistanceTour();
            travellingSalesmanImplementor.displayPath();
            travellingSalesmanImplementor.displayTotalMinimumDistance();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
