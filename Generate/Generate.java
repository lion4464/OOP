package Generate;
import java.util.Random;

public class Generate {
    private int number;
    private Random generate=new Random(100000);
    //defoult constructor

    public Generate() {
        this(0);
    }

    //constructor
    public Generate(int number) {
        number=(number>0)?number:0;
        this.number = number;

    }

    //set number to number field
    public void setNumber(int number) {
        this.number = number;
    }

    //    create nextInt method
    public void GenerateNumber(){
        for (int i=0;i<this.number;i++){
            System.out.println(this.generate.nextInt(100000)+" ");
        }
    }

    @Override
    public String toString() {
        return "Generate{" +
                "number=" + number +
                '}';
    }
}
