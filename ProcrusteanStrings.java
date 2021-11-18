import java.util.*;

/* Output the result.  */

public class Peanut {

    public static void main(String[] args) {
        (new WorkerClass()).Run();
        (new ProcrutseanAlgorithm()).ImplementPrutseanAlgorithm();
    }

}

class WorkerClass {
    public static ArrayList Data;
    public void Run() {
        // #todo come up a way to randomly generate strings of random lengths
        GenerateRandomStrings g = new GenerateRandomStrings();

        Data = new ArrayList();
        
        for (int i = 1; i <= 20; i++) {
            Data.add(g.MakeAString());
        }

    }

}

class ProcrutseanAlgorithm {

    // Now iterate over your ArrayList and force each string to be 20 characters in Length
    static ArrayList DataToProcess =WorkerClass.Data;
    
    public void ImplementPrutseanAlgorithm() {
        // #todo implement the ImplementPrutseanAlgorithm() method
    }

}

class GenerateRandomStrings{
    java.util.Random rand;
    public String MakeAString(){
        rand = new Random();
        
        return "tempvalue";
    }
}
