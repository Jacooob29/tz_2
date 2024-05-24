package com.example;
import static org.junit.Assert.*;
import org.junit.Test;


public class AppTest {
    
    @Test
    public void testMin1() {
        App app = new App("test1.txt");
        assertEquals(1, app._min());
    }
    @Test
    public void testMax1() {
        assertEquals(6, new App("test1.txt")._max());
    }
    @Test
    public void testSum1() {
        assertEquals(21, new App("test1.txt")._sum());
    }
    @Test
    public void testMult1() {
        assertEquals(720, new App("test1.txt")._mult());
    }

    @Test
    public void testMin2() {
        App app = new App("test2.txt");
        assertEquals(-1, app._min());
    }
    @Test
    public void testMax2() {
        assertEquals(23, new App("test2.txt")._max());
    }
    @Test
    public void testSum2() {
        assertEquals(67, new App("test2.txt")._sum());
    }
    @Test
    public void testMult2() {
        assertEquals(71539200, new App("test2.txt")._mult());
    }

    @Test
    public void testMin3() {
        App app = new App("test3.txt");
        assertEquals(0, app._min());
    }
    @Test
    public void testMax3() {
        assertEquals(3243, new App("test3.txt")._max());
    }
    @Test
    public void testSum3() {
        assertEquals(6053, new App("test3.txt")._sum());
    }
    @Test
    public void testMult3() {
        assertEquals(0, new App("test3.txt")._mult());
    }

    @Test
    public void testMin4() {
        App app = new App("test4.txt");
        assertEquals(0, app._min());
    }
    @Test
    public void testMax4() {
        assertEquals(2343, new App("test4.txt")._max());
    }
    @Test
    public void testSum4() {
        assertEquals(5046, new App("test4.txt")._sum());
    }
    @Test
    public void testMult4() {
        assertEquals(0, new App("test4.txt")._mult());
    }

    @Test
    public void testMin5() {
        App app = new App("test5.txt");
        assertEquals(0, app._min());
    }
    @Test
    public void testMax5() {
        assertEquals(20, new App("test5.txt")._max());
    }
    @Test
    public void testSum5() {
        assertEquals(210, new App("test5.txt")._sum());
    }
    @Test
    public void testMult5() {
        assertEquals(0, new App("test5.txt")._mult());
    }

    @Test
    public void testMin6() {
        App app = new App("test6.txt");
        assertEquals(0, app._min());
    }
    @Test
    public void testMax6() {
        assertEquals(3554565, new App("test6.txt")._max());
    }
    @Test
    public void testSum6() {
        assertEquals(3906504, new App("test6.txt")._sum());
    }
    @Test
    public void testMult6() {
        assertEquals(0, new App("test6.txt")._mult());
    }

    @Test
    public void testMin7() {
        App app = new App("test7.txt");
        assertEquals(0, app._min());
    }
    @Test
    public void testMax7() {
        assertEquals(32, new App("test7.txt")._max());
    }
    @Test
    public void testSum7() {
        assertEquals(216, new App("test7.txt")._sum());
    }
    @Test
    public void testMult7() {
        assertEquals(0, new App("test7.txt")._mult());
    }

    @Test
    public void testMin8() {
        App app = new App("test8.txt");
        assertEquals(1, app._min());
    }
    @Test
    public void testMax8() {
        assertEquals(6, new App("test8.txt")._max());
    }
    @Test
    public void testSum8() {
        assertEquals(52, new App("test8.txt")._sum());
    }
    @Test
    public void testMult8() {
        assertEquals(720, new App("test8.txt")._mult());
    }

    @Test
    public void testMin9() {
        App app = new App("test9.txt");
        assertEquals(1, app._min());
    }
    @Test
    public void testMax9() {
        assertEquals(6555, new App("test9.txt")._max());
    }
    @Test
    public void testSum9() {
        assertEquals(61544, new App("test9.txt")._sum());
    }
    @Test
    public void testMult9() {
        assertEquals(0, new App("test9.txt")._mult());
    }

    @Test
    public void testMin10() {
        App app = new App("test10.txt");
        assertEquals(1, app._min());
    }
    @Test
    public void testMax10() {
        assertEquals(6, new App("test10.txt")._max());
    }
    @Test
    public void testSum10() {
        assertEquals(1470, new App("test10.txt")._sum());
    }
    @Test
    public void testMult10() {
        assertEquals(0, new App("test10.txt")._mult());
    }

    @Test
    public void testMin11() {
        App app = new App("test11.txt");
        assertEquals(1, app._min());
    }
    @Test
    public void testMax11() {
        assertEquals(564, new App("test11.txt")._max());
    }
    @Test
    public void testSum11() {
        assertEquals(33270, new App("test11.txt")._sum());
    }
    @Test
    public void testMult11() {
        assertEquals(0, new App("test11.txt")._mult());
    }

    @Test
    public void testMin12() {
        App app = new App("test12.txt");
        assertEquals(1, app._min());
    }
    @Test
    public void testMax12() {
        assertEquals(43435, new App("test12.txt")._max());
    }
    @Test
    public void testSum12() {
        assertEquals(2238500, new App("test12.txt")._sum());
    }
    @Test
    public void testMult12() {
        assertEquals(0, new App("test12.txt")._mult());
    }

    @Test
    public void testMin13() {
        App app = new App("test13.txt");
        assertEquals(1, app._min());
    }
    @Test
    public void testMax13() {
        assertEquals(6, new App("test13.txt")._max());
    }
    @Test
    public void testSum13() {
        assertEquals(7182, new App("test13.txt")._sum());
    }
    @Test
    public void testMult13() {
        assertEquals(0, new App("test13.txt")._mult());
    }

    @Test
    public void testMin14() {
        App app = new App("test14.txt");
        assertEquals(1, app._min());
    }
    @Test
    public void testMax14() {
        assertEquals(135, new App("test14.txt")._max());
    }
    @Test
    public void testSum14() {
        assertEquals(276360, new App("test14.txt")._sum());
    }
    @Test
    public void testMult14() {
        assertEquals(0, new App("test14.txt")._mult());
    }

    @Test
    public void testMin15() {
        App app = new App("test15.txt");
        assertEquals(-12223, app._min());
    }
    @Test
    public void testMax15() {
        assertEquals(736256, new App("test15.txt")._max());
    }
    @Test
    public void testSum15() {
        assertEquals(1416349152, new App("test15.txt")._sum());
    }
    @Test
    public void testMult15() {
        assertEquals(0, new App("test15.txt")._mult());
    }
}
