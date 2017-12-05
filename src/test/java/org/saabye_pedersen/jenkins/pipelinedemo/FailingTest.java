package org.saabye_pedersen.jenkins.pipelinedemo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FailingTest {

    @Test
    public void test(){
        assertTrue( "this will fail", false);
    }

}
