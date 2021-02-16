package greedy.assignCookies;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssignCookiesTest {

    @Test
    public void findContentChildren() {
        int[] g = new int[]{1,2,3};
        int[] s = new int[]{3};
        AssignCookies assignCookies = new AssignCookies();
        int contentChildren = assignCookies.findContentChildren(g, s);
        Assert.assertEquals(contentChildren, 1);
    }
}