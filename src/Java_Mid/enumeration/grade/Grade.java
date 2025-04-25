package Java_Mid.enumeration.grade;

/**
 * 성적 등급을 나타내는 열거형
 */
public enum Grade {
    A(90, "우수"),
    B(80, "양호"),
    C(70, "보통"),
    D(60, "미흡"),
    F(0, "불합격");

    private final int minimumScore;
    private final String description;

    Grade(int minimumScore, String description) {
        this.minimumScore = minimumScore;
        this.description = description;
    }

    public int getMinimumScore() {
        return minimumScore;
    }

    public String getDescription() {
        return description;
    }

    public static Grade fromScore(int score) {
        if (score >= A.minimumScore) return A;
        if (score >= B.minimumScore) return B;
        if (score >= C.minimumScore) return C;
        if (score >= D.minimumScore) return D;
        return F;
    }
} 