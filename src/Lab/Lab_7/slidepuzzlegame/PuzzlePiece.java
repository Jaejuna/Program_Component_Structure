package Lab.Lab_7.slidepuzzlegame;

public class PuzzlePiece {

    private int face_value;

    public PuzzlePiece(int value){
        if (value >= 1 && value <= 15)
            face_value = value;
        else
            System.out.println("Error");
    }

    public int valueOf(){
        return face_value;
    }
}
