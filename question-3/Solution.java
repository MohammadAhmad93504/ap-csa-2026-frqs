public int countGreaterHistoryAbsences() { 
    int totalMatchingStudents = 0;
    
    for (CourseRecord historyRecord : historyList) {
        String historyID = historyRecord.getStudentID(); 
        int historyAbs = historyRecord.getAbsences(); 

        for (CourseRecord mathRecord : mathList) {
            String mathID = mathRecord.getStudentID();
            
            if (mathID.equals(historyID)) {
                int mathAbs = mathRecord.getAbsences();
                
                if (historyAbs > mathAbs) {
                    totalMatchingStudents++; 
                }
            }
        }       
    }
    return totalMatchingStudents;
}
