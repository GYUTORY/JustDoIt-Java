// #enum 클래스의 등장 #enum
package Java_Mid.enumeration.basic;

/**
 * 기본적인 성적 등급을 나타내는 열거형
 */
public enum Grade {
    A(90, "우수"),
    B(80, "양호"),
    C(70, "보통"),
    D(60, "미흡"),
    F(0, "불합격");

    private final int score;
    private final String description;

    Grade(int score, String description) {
        this.score = score;
        this.description = description;
    }

    public int getScore() {
        return score;
    }

    public String getDescription() {
        return description;
    }
}
