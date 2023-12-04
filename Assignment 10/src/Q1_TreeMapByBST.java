/* Assignment 10 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (50 marks in total)
    Use mutils.BinarySearchTree as a basic structure to implement a TreeMap for <String, Integer>.
    You cannot use JCF provided map.
 */

import mutils.BinarySearchTree;
import mutils.Node;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Q1_TreeMapByBST {

    // use m_bst as the basic data structure for the treemap of <String, Integer>
    BinarySearchTree m_bst = new BinarySearchTree();



    // Question 1.1 (5 marks): implement method size().
    // Returns the number of elements in this map (its cardinality).
    // You can ONLY modify the body of this method including the return statement.
    public int findSize(Node node){
        if (node == null){
            return 0;
        }
        return (findSize(node.left) + findSize(node.right) + 1);
    }

    public int size() {

        return findSize(m_bst.root);
    }

    // Question 1.2 (5 marks): implement method isEmpty().
    // Returns true if this map contains no elements, otherwise return false.
    // You can ONLY modify the body of this method including the return statement.
    public boolean isEmpty() {
        return size() == 0;
    }

    // Question 1.3 (15 marks) implement method get().
    // If key is contained in the map, return the value of the key.
    // If key is not contained in the map, return -1.
    // You can ONLY modify the body of this method including the return statement.
    public int findKey(Node node, String key) {
        if (node != null) {
            if (Objects.equals(node.data, key)) {
                return node.freq;
            } else {
                int left_val = findKey(node.left, key);
                if (left_val != -1) {
                    return left_val;
                }
                int right_val = findKey(node.left, key);
                if (right_val != -1) {
                    return right_val;
                }else{
                    return -1;
                }
            }
        } else {
            return -1;
        }
    }

    public int get(String key) {
        return findKey(m_bst.root, key);
    }

    // Question 1.4 (15 marks) implement method put().
    // If the key is already contained in the map, overwrite the old value and return -1;
    // If the key is not contained in the map, add a new <key,value> entry to the map and return 1;
    // You can ONLY modify the body of this method including the return statement.
    public void rewrite(Node node, String key, int value){

        if(node != null){
            if(Objects.equals(node.data, key)){
                node.freq = value;
            }
            rewrite(node.right, key, value);
            rewrite(node.left, key, value);
        }

    }

    public int put(String key, int value) {
        if(get(key) != -1){
            rewrite(m_bst.root, key, value);
            return -1;
        }
        Node new_node = new Node(key, value);
        m_bst.insert(new_node);
        return 1;
    }
    void sortKeys(ArrayList<String> arr, Node node){
        if(node != null){
            arr.add(node.data);
            sortKeys(arr, node.left);
            sortKeys(arr, node.right);
        }

    }

    // Question 1.5 (10 marks) implement method getKeysInAlphabeticalOrder().
    // return the keys of this map as an ArrayList<String> in Alphabetical order.
    // You can ONLY modify the body of this method including the return statement.
    public ArrayList<String> getKeysInAlphabeticalOrder(){
        ArrayList<String> array = new ArrayList<String>();
        sortKeys(array, m_bst.root);
        Collections.sort(array);
        return array;
    }
}
