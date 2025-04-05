class Person {
   private String name;
   private int age;
   private String gender;


   Person(String name,int age,String gender) {
       this.name = name;
       this.age = age;
       this.gender = gender;
   }
   Person(Person s){
       this.name=s.name;
       this.age=s.age;
       this.gender=s.gender;
   }void Persondetails(){
       System.out.println("Name: "+name);
       System.out.println("Age : "+age);
       System.out.println("Gender : "+gender);
   }}
class Main {
       public static void main(String[] args){
           Person p = new Person("Aromal",23,"Male");
           System.out.println("---Oringinal Detail---");
           p.Persondetails();
           System.out.println("---Copy of Detail---");
           Person s = new Person(p);
           s.Persondetails();
       }
}
