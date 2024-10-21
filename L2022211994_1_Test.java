import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

/**
 * 测试用例设计总体原则：
 * 使用等价类划分原则和边界值分析法设计测试用例。
 */
public class L2022211994_1_Test {
    
    /**
     * 测试目的：验证输入字符串 "25525511135" 能正确恢复为 ["255.255.11.135","255.255.111.35"]
     * 用到的测试用例：s = "25525511135"
     */
    @Test
    public void testRestoreIpAddresses1() {
        Solution solution = new Solution();
        List<String> expected = List.of("255.255.11.135", "255.255.111.35");
        assertEquals(expected, solution.restoreIpAddresses("25525511135"));
    }

    /**
     * 测试目的：验证输入字符串 "0000" 能正确恢复为 ["0.0.0.0"]
     * 用到的测试用例：s = "0000"
     */
    @Test
    public void testRestoreIpAddresses2() {
        Solution solution = new Solution();
        List<String> expected = List.of("0.0.0.0");
        assertEquals(expected, solution.restoreIpAddresses("0000"));
    }

    /**
     * 测试目的：验证输入字符串 "101023" 能正确恢复为 ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
     * 用到的测试用例：s = "101023"
     */
    @Test
    public void testRestoreIpAddresses3() {
        Solution solution = new Solution();
        List<String> expected = List.of("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3");
        assertEquals(expected, solution.restoreIpAddresses("101023"));
    }

}
