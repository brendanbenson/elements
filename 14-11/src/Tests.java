import java.util.List;

import static java.util.Arrays.asList;
import static testutils.TestUtils.assertEqual;

public class Tests {
    public static void main(String[] args) throws Exception {
        SalaryThreshold salaryThreshold = new SalaryThreshold();

        List<Integer> salaries = asList(90, 30, 100, 40, 20);
        int totalBudget = 210;

        int salaryCap = salaryThreshold.findSalaryCap(salaries, totalBudget);

        assertEqual(salaryCap, 60);
    }
}
