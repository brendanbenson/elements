package testutils;

public class TestUtils {
    public static void assertTrue(Boolean result) throws Exception {
        if (result == null) {
            throw new Exception("Expected value to be true, but it was null.");
        }

        if (!result) {
            throw new Exception("Expected value to be true, but it was false.");
        }
        System.out.println("PASS");
    }

    public static void assertFalse(Boolean result) throws Exception {
        if (result == null) {
            throw new Exception("Expected value to be false, but it was null.");
        }

        if (result) {
            throw new Exception("Expected value to be false, but it was true.");
        }
        System.out.println("PASS");
    }

    public static void assertEqual(Object a, Object b) throws Exception {
        if (!a.equals(b)) {
            throw new Exception(a + " does not equal " + b);
        }
        System.out.println("PASS");
    }

    public static void assertWithin(double a, double b, double distance) throws Exception {
        double top = a + distance;
        double bottom = a - distance;

        if (b <= top && b >= bottom) {
            System.out.println("PASS");
        } else {
            throw new Exception(a + " is not within " + distance + " of " + b);
        }
    }

    public static void assertNull(Object a) throws Exception {
        if (a != null) {
            throw new Exception("Expected " + a + " to be null.");
        }
        System.out.println("PASS");
    }
}
