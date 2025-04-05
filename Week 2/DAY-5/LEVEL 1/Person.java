class Person {
    String name;
    int id;
    Person(String name,int id){
        this.name=name;
        this.id=id;
    }
}
class Chef extends Person{
Chef(String name,int id){
    super(name,id);
}
void performDuties(String work){
    System.out.println("the work assigned to chef :"+work);
}
}
class Waiter extends Person{
    Waiter(String name,int id){
        super(name,id);
    }
    void performDuties(String work){
        System.out.println("the work assigned to Waiter :"+work);
    }
}
class test1{
    public static void main(String[] args){
        String n="dff";
        int i = 567;
        Chef s = new Chef(n,i);
        s. performDuties(" Clean the room");
    }
}
