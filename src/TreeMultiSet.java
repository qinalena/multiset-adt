public class TreeMultiSet extends MultiSet {
    private Tree tree

    // TODO add a Tree object as a private instance variable for this class.
    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    @Override
    void add(Integer item) {
        tree.add(item);
        // TODO complete this method
    }
    // TODO write the rest of the implementation for this class so that it uses its private Tree
    //      object to provide the MultiSet functionality.

    void remove(Integer item) {
        tree.delete_item(item);
    }

    boolean contains(Integer item) {
        return tree.contains(item);
    }
}
