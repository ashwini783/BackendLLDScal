package AdderSubtractorSyncMethod;

public class Value {
    int value=0;

    synchronized void incrementBy(int i) {
        value+=i;
    }
    synchronized void decrementBy(int i) {
        value-=i;
    }
}
