public int getPointsForRow(int targetRow) {
    boolean streak = true; 
    int total = 0; 
    for (int c = 0; c < board[0].length; c++){ 
        total+= board[targetRow][c].getPoints(); 
        String color = board[targetRow][0].getColor(); 
        if (!(board[targetRow][c].getColor().equals(color))){
            streak = false; 
        }
    }
    if (word) {
        total*=2; 
    }
    return total; 
}
