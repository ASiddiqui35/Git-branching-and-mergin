import org.testng.Assert;

public class TestCal {
    public static void main(String[] args) {
        Calculator str = new Calculator();
        str.setName("Bob");
        Assert.assertEquals("hobby0",str.getName());
    }
}
