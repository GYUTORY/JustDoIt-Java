package Java_Mid.math.test;

import java.util.Random;

public class LottoGenerator {

    private final Random random = new Random();
    private int[] lottoNumberts;
    private int count;

    public int[] generate() {
        lottoNumberts = new int[6];
        count = 0;

        while (count < 6) {
            int number = random.nextInt(45) + 1;
            if (isUnique(number)) {
                lottoNumberts[count] = number;
                count++;
            }
        }
        return lottoNumberts;
    }

    // 이미 생성된 번호와 중복되는지 검사
    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (lottoNumberts[i] == number) {
                return false;
            }
        }
        return true;
    }

}
