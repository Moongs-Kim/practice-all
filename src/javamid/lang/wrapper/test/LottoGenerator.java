package javamid.lang.wrapper.test;

import java.util.Random;

public class LottoGenerator {

    public static void main(String[] args) {
        Random lottoGenerator = new Random();
        int[] lotto = new int[6];
        int count = 0;

        /*while (count < 6) {
            int lottoNum = lottoGenerator.nextInt(45) + 1;
            System.out.println("lottoNum = " + lottoNum);
            if (count == 0) {
                lotto[count] = lottoNum;
            }

            for (int i = 0; i < count; i++) {
                if (lottoNum == lotto[i]) {
                    count--;
                    break;
                }

                lotto[count] = lottoNum;
            }
            count++;
        }*/


        while (count < 6) {
            boolean duplit = false;
            int lottoNum = lottoGenerator.nextInt(45) + 1;
            System.out.println("lottoNum = " + lottoNum);
            if (count == 0) {
                lotto[count++] = lottoNum;
                continue;
            }

            for (int i = 0; i < count; i++) {
                if (lottoNum == lotto[i]) {
                    duplit = false;
                    break;
                }
                duplit = true;
            }

            if (duplit) {
                lotto[count++] = lottoNum;
            }
        }

        System.out.print("로또 번호: ");
        for (int i : lotto) {
            System.out.print(i + " ");
        }
    }
}
