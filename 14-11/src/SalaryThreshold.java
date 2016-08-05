import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class SalaryThreshold {
    public int findSalaryCap(List<Integer> salaries, int totalBudget) {
        Collections.sort(salaries);

        Integer sum = salaries.stream().reduce(Math::addExact).get();

        return 0;
    }
}
