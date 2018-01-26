package org.springtutorial.model;

import org.springtutorial.customannotation.InjectRandomInt;
import org.springtutorial.postproxy.PostProxy;
import org.springtutorial.profiling.Profiling;

import javax.annotation.PostConstruct;

@Profiling
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

    public void setMessage(String message) {
        this.message = message;
    }
}
