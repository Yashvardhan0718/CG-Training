class StringConcatComparison {


   public static void main(String[] args) {
       int iterations = 1_000_000;
       String text = "hello";


       StringBuilder sb = new StringBuilder();
       long startSB = System.nanoTime();
       for (int i = 0; i < iterations; i++) {
           sb.append(text);
       }
       long endSB = System.nanoTime();
       long timeSB = endSB - startSB;


       StringBuffer sbf = new StringBuffer();
       long startSBF = System.nanoTime();
       for (int i = 0; i < iterations; i++) {
           sbf.append(text);
       }
       long endSBF = System.nanoTime();
       long timeSBF = endSBF - startSBF;


       System.out.println("StringBuilder Time (ns): " + timeSB);
       System.out.println("StringBuffer  Time (ns): " + timeSBF);
   }
}


