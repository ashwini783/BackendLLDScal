package AdderSubtractorAtomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Value {
    AtomicInteger value=new AtomicInteger(0);
}


//AtomicInteger datastructure uses compare and swap algorithm
//if(value==x) t->value
// else reread the initial value