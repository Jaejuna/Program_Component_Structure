package HW.HW4;

public class Dice {

    public static void throwDice() {
        int p1d1 = (int) ((Math.random() * 6) + 1);
        int p1d2 = (int) ((Math.random() * 6) + 1);
        int p2d1 = (int) ((Math.random() * 6) + 1);
        int p2d2 = (int) ((Math.random() * 6) + 1);

        System.out.println("첫 번째 사람: " + p1d1 + ", " + p1d2);
        System.out.println("두 번째 사람: " + p2d1 + ", " + p2d2);

        if(p1d1 == p1d2 & p2d1 != p2d2){
            System.out.println("첫 번째 사람이 이겼습니다.");
        }
        else if (p2d1 == p2d2 & p1d1 != p1d2){
            System.out.println("두 번째 사람이 이겼습니다.");
        }
        else if (p1d1 != p1d2 & p2d1 != p2d2){
            if (p1d1+p1d2 > p2d1+p2d2)
                System.out.println("첫 번째 사람이 이겼습니다.");
            else if (p1d1+p1d2 < p2d1+p2d2)
                System.out.println("두 번째 사람이 이겼습니다.");
            else
                if (Math.abs(p1d1-p1d2) < Math.abs(p2d1-p2d2)){
                    System.out.println("첫 번째 사람이 이겼습니다.");
                }
                else if (Math.abs(p1d1-p1d2) > Math.abs(p2d1-p2d2)){
                    System.out.println("두 번째 사람이 이겼습니다.");
                }
                else
                    System.out.println("비겼습니다.");
        }
    }
}

