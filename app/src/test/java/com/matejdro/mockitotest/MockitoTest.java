package com.matejdro.mockitotest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MockitoTest {
    /**
     * This one crashes
     */
    @Test
    public void testOriginalFunction() {
        Mockito.mock(kotlin.Function.class);
    }

    /**
     * This one works OK (just dummy extension)
     */
    @Test
    public void testExtendedFunction() {
        Mockito.mock(DummyFunctionExtension.class);
    }


    public interface DummyFunctionExtension extends kotlin.Function {
    }
}