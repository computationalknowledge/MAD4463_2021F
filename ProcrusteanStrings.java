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
        
        String dataString = "peanut"; 
        Data = new ArrayList();
        
        for (int i = 1; i <= 20; i++) {
            Data.add(dataString);
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
