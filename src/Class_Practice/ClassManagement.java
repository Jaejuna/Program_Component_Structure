import javax.swing.*;

public class ClassManagement {

    /*computeAverage - 제출한 시험 점수 평균 계산
    * @param how_many - 시험 점수의 개수 (양수)
    * @return - 평균 점수*/
    public double computerAverage(int how_many){
        double total_points = 0.0;
        int count = 0;
        boolean processing = true;
        while (processing){
            // loop invariant : total_points == exam_1 + ... + exam_count
            String message = "다음 시험 점수? (입력 완료시 Cancel 버튼 누름)";
            String input = JOptionPane.showInputDialog(message);
            if (input == null) //Cancel 버튼을 눌렀음
                processing = false;
            else {
                int score = Integer.parseInt(input);
                total_points = total_points + score;
                count = count + 1;
            }
            System.out.println("개수 = " + count + ", 누적 점수 = " + total_points);
        }
        if(count == 0)
            throw new RuntimeException("computerAverage error: 계산할 점수가 없습니다.");
        return total_points / count;
    }

    public static void main(String[] args) {
        ClassManagement loop = new ClassManagement();
        System.out.println("평균 점수 = " + loop.computerAverage(-1));
    }
}