class Circle {
   private int Radius;
   private double area;
   private double circum;


   Circle(int Radius){
       this.Radius=Radius;
       Calculate();
   }private void Calculate(){
        area = 3.14*Math.pow(Radius,2);
        circum = 2*3.14*Radius;
   }
   void display(){
       System.out.println("Area of Circle: "+area);
       System.out.println("Circumfrence of circle: "+circum);
   }
}
class ans{
   public static void main(String[] args){
       Circle c= new Circle(5);
       c.display();
   }}
