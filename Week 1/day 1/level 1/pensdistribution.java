class Main {
    public static void main(String[] args) {

        int totalPens = 14;
        int students = 3;
        
        int nonDistributed = 14 % 3;//mod
        
        int distributed = totalPens/students;
        
        System.out.println("The Pen Per Student is " + distributed + " and the remaining pen not distributed is " + nonDistributed);
    }
}

