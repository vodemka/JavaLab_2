package by.belstu.it.dokurno.basejava;

import java.util.Objects;

/**
 * @author Vadim
 * @version 1.0
 */
public class WrapperString {
    private String testStr;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WrapperString that = (WrapperString) o;
        return Objects.equals(testStr, that.testStr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testStr);
    }

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public WrapperString(String testStr) {
        this.testStr = testStr;
    }

    @Override
    public String toString() {
        return "WrapperString{" +
                "testStr='" + testStr + '\'' +
                '}';
    }

    public String replaces(char oldchar, char newchar) {
        this.testStr = this.testStr.replace(oldchar, newchar);
        System.out.println("Method");
        return testStr;
    }
}