import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TreeTest {
    @Test
    public void insert() {
        Tree bst = new Tree();
        assertNull(bst.getRoot());

        bst.insert(25);
        assertEquals(bst.getRoot().data, 25);

        bst.insert(1);
        assertEquals(bst.getRoot().left.data, 1);

        bst.insert(3);
        assertEquals(bst.getRoot().left.right.data, 3);
    }
    @Test
    public void search() {
        Tree bst = new Tree(25);
        assertNull(bst.search(10));

        bst.insert(15);
        assertEquals(bst.search(15).data, 15);

    }
}