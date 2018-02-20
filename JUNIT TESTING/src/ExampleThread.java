
public class ExampleThread implements Runnable {

    private int myVar;

    public ExampleThread(int var) {
        this.myVar = var;
    }


	@Override
    public void run() {
        if (this.myVar < 0) {
            throw new IllegalArgumentException("Number less than Zero");
        } else {
            System.out.println("Number is " + this.myVar);
        }
    }
}
