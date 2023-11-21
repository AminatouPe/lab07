package it.unibo.inner.Impl;

import java.util.Iterator;

import it.unibo.inner.api.IterableWithPolicy;
import it.unibo.inner.api.Predicate;

public class ItarableWithPolicyImpl implements IterableWithPolicy {

    @Override
    public Iterator iterator() {
       
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    @Override
    public void setIterationPolicy(Predicate filter) {
        
        throw new UnsupportedOperationException("Unimplemented method 'setIterationPolicy'");
    }
    
}
