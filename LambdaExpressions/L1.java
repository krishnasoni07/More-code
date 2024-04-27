package LambdaExpressions;

interface Krishna{
    void HisLove();
}
interface Naina{
    void HerLove();
}

interface Shaina extends Krishna,Naina{
    void OurLove();
}

public class L1 {
    public static void main(String[] args) {
        Shaina Kid = new Shaina(){
            public void HisLove(){
                System.out.println("Love of Naina");
            }
            public void HerLove(){
                System.out.println("Love of Krishna");
            }
            public void OurLove(){
                System.out.println("Daughter of Krishna and Naina");
            }
        };

        Kid.HerLove();
        Kid.HisLove();
        Kid.OurLove();
    }
}
