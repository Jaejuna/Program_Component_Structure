import javax.swing.*;

public class ClassManagement {

    public double computerAverage(int how_many){
        double total_points = 0.0;
        int count = 0;
        while (count != how_many){
            String input = JOptionPane.showInputDialog("다음 시험 점수?");
            int score = Integer.parseInt(input);
            total_points = total_points + score;
            count = count +1;
            System.out.println("개수 = " + count + ", 누적 점수 = " + total_points);
        }
        return total_points / how_many;
    }

    public static void main(String[] args) {
        ClassManagement loop = new ClassManagement();
        System.out.println("평균 점수 = " + loop.computerAverage(5));
    }
}
