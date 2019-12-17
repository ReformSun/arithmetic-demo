package com.test.google;

import com.google.common.base.Charsets;
import com.google.common.hash.*;

/**
 * {http://ifeve.com/google-guava-hashing/}
 */
public class TestHash {
    public static void main(String[] args) {

    }

    public static void testMethod1(){
        Funnel<Test> personFunnel = new Funnel<Test>() {
            @Override
            public void funnel(Test test, PrimitiveSink into) {

            }
        };

        HashFunction hf = Hashing.md5();
        HashCode hc = hf.newHasher()
                .putLong(11)
                .putString("ss", Charsets.UTF_8)
                .putObject(new Test(), personFunnel)
                .hash();

    }
}

class Test{

}
