package greedy.partitionLabels;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PartitionLabelsTest {

    @Test
    public void partitionLabels() {
        PartitionLabels test = new PartitionLabels();
        String s = "ababcbacadefegdehijhklij";
        List<Integer> integers = test.partitionLabels(s);
        System.out.println(integers);
    }
}