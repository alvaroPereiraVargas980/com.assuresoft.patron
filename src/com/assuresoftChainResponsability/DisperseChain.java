package com.assuresoftChainResponsability;

public interface DisperseChain {
    void setNextChain(DisperseChain nextChain);
    void disperse(Currency cur);
}
