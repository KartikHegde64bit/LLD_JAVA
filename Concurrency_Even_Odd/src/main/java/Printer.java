public class Printer implements Runnable{
    private Integer curVal;
    private Integer maxValue;
    private String type;
    private State state;

    public Printer(State state, Integer init, Integer maxValue, String type){
        this.type = type;
        this.curVal = init;
        this.maxValue = maxValue;
        this.state = state;
    }

    @Override
    public void run(){
        while(curVal <= maxValue){
            synchronized (state){
                try {
                    while (!type.equals(state.getState())) {
                        state.wait();
                    }


                    System.out.println("Current thread: " + Thread.currentThread().getName() + " curVal: " + curVal);
                    curVal+=2;
                    if (state.getState().equals("EVEN"))
                        state.setState("ODD");
                    else
                        state.setState("EVEN");
                    state.notifyAll();
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }
    }
}
