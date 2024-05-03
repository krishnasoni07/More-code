package OOPs;


class Persons {
    StringBuilder name = new StringBuilder();
    int age;
    
    public Persons( StringBuilder name , int age ){
        this.name = name;
        this.age = age;
    }

    public void setName(StringBuilder name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public StringBuilder getName(){
        return name;
    }

    public int getAge(){
        return age;
    }


    public static void main(String args[]){

        System.out.println();
        System.out.println();
        Persons arr[] = new Persons[2];
        arr[0] = new Persons(new StringBuilder("Krishna soni"), 21);
        arr[1] = new Persons(new StringBuilder("Naina Hemnani"), 20);
        
        System.out.print( arr[0].getName() + " ");
        System.out.println( arr[0].getAge() );
        System.out.print( arr[1].getName() + " " );
        System.out.println( arr[1].getAge() );
        
        System.out.println();
        System.out.println();
        
    }
}
