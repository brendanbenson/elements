import java.util.List;

public class ScoreFinder {
    public int findCombinations(int finalScore, List<Integer> individualPlayScores) {
        int[][] scoreCombinations = new int[individualPlayScores.size()][finalScore + 1];

        for (int scoreIndex = 0; scoreIndex < individualPlayScores.size(); ++scoreIndex) {
            scoreCombinations[scoreIndex][0] = 1;

            for(int desiredScore = 1; desiredScore <= finalScore; ++desiredScore) {
                Integer score = individualPlayScores.get(scoreIndex);

                int combinationsWithoutScore = scoreIndex > 0 ?
                        scoreCombinations[scoreIndex - 1][desiredScore] :
                        0;

                int combinationsWithScore = desiredScore - score >= 0 ?
                        scoreCombinations[scoreIndex][desiredScore - score] :
                        0;

                scoreCombinations[scoreIndex][desiredScore] = combinationsWithoutScore + combinationsWithScore;
            }
        }

        return scoreCombinations[individualPlayScores.size() - 1][finalScore];
    }
}

//      0   1   2   3   4   5   6   7   8   9   10  11  12
//  -   1   0   0   0   0   0   0   0   0   0   0   0   0
//  2   1   0   1   0   1   0   1   0   1   0   1   0   1
//  3   1   0   1   1   1   1   2   1   2   2   2   2   3
//  7   1   0   1   1   1   1   2   2   2   3   3   3   4
