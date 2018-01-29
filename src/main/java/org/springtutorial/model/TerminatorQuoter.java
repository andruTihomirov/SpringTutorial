package org.springtutorial.model;

import org.springtutorial.customannotations.deprecated.DeprecatedClass;
import org.springtutorial.customannotations.randomannotation.InjectRandomInt;
import org.springtutorial.customannotations.postproxy.PostProxy;
import org.springtutorial.customannotations.profiling.Profiling;

import javax.annotation.PostConstruct;

@Profiling
@DeprecatedClass(newImpl = T1000.class)
public class TerminatorQuoter implements Quoter {

    @InjectRandomInt(min = 2, max = 7)
    private int repeat;

    private String message;

    public TerminatorQuoter() {
        System.out.println("Phase 1: " +  repeat);
    }

    @PostConstruct
    public void init() {
        System.out.println("Phase 2: " +  repeat);
    }

    @Override
    @PostProxy
    public void sayQuote() {
        for (int  i = 0; i < repeat; i++) {
            System.out.println("message: " + message);
        }
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
