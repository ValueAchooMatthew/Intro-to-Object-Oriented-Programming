/* Assignment 10 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (50 marks in total)
    Use the Q1_TreeMapByBST to implement a WordCounter to count words in documents.
    You cannot use JCF provided map.
 */

import mutils.Node;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.io.FileReader;
import java.io.Reader;

public class Q2_WordCounter {
    // use the m_treemap as the data structure for word counting
    Q1_TreeMapByBST m_treemap = new Q1_TreeMapByBST();


    // Question 2.1 (15 marks) implement buildTreeMap() to build a treemap that stores
    // the words and word frequencies of a document into m_treemap.
    // "filename" is the path to the file. Please use the "JingleBell.txt" under folder "data".
    // You can ONLY modify the body of this method including the return statement.
    public void buildTreeMap(String filename){
        try{
            Reader file_reader = new FileReader(filename);

            // We can also wrap a file reader as a buffered reader to improve I/O efficiency.
            BufferedReader buffered_reader = new BufferedReader(file_reader);

            Scanner words = new Scanner(buffered_reader);

            while(words.hasNext()){
                String word = words.next().trim();
                if (word.equals("1]") || word.equals("2]")){
                    continue;
                }
                word = word.replace("[", "");
                word = word.replace("]", "");
                word = word.replace(",", "");
                word = word.toLowerCase();
                // add to treemap
                int frequency = m_treemap.get(word);
                if (frequency!=-1){
                    m_treemap.put(word, frequency+1);
                }else{
                    m_treemap.put(word, 1);
                }
            }
            buffered_reader.close();

        }catch (IOException exception){
            throw new RuntimeException(exception);
        }


    }

    // Question 2.2 (15 marks) print all the counted words in the document in alphabetical order.
    // You can ONLY modify the body of this method including the return statement.
    public void printWordsAlphabetical(){
        ArrayList<String> array = m_treemap.getKeysInAlphabeticalOrder();
        array.forEach((element)-> System.out.println(element + " "));
    }

    public void frequencyOfOutput(BufferedWriter writer, Node node ){
        if(node!= null){
            frequencyOfOutput(writer, node.right);
            try{
                writer.write("\t"+node.data + " <" +node.freq + " >");
            }catch (IOException exception){
                throw new RuntimeException(exception);
            }
            frequencyOfOutput(writer, node.left);

        }

    }

    // Question 2.3 (15 marks) write an output file named "Output.txt" under folder "data"
    // The output of will consist of two lists.
    // Each list contains all the words from the file, along with the number of times
    // that the word occurred.
    // One list is sorted alphabetically.
    // The other list is sorted according to the number of occurrences, with the most
    // common words (i.e., a word with a larger frequency or count is said to be more common)
    // at the top and the least common at the bottom.
    // IMPORTANT: the output format is given in the file "Output_Example.txt" under folder "data".
    // Input parameter "filename" is the path to the output file.
    public void outputResult(String filename){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            writer.write(m_treemap.size()-2 + "<- The number of words found in the file" );
            ArrayList<String> sorted = new ArrayList<>(m_treemap.getKeysInAlphabeticalOrder());
            sorted.forEach((word)->{
                try{
                    writer.write("   " +word + "<" +m_treemap.get(word)+ ">\n");
                }catch (IOException exception){
                    throw new RuntimeException(exception);
                }
            });
            writer.write("\n The following are a list of words with their frequency of occurance");
            frequencyOfOutput(writer, m_treemap.m_bst.root);
            writer.flush();
            writer.close();


        }catch (IOException exception){
            throw new RuntimeException(exception);
        }

    }

    // Question 2.4 (5 marks) call each of the above methods in the main() method to
    // successfully count the words and produce expected outputs.
    public static void main(String[] args){
        Q2_WordCounter word_counter = new Q2_WordCounter();
        word_counter.buildTreeMap("src/data/JingleBell.txt");
        word_counter.printWordsAlphabetical();
        word_counter.outputResult("src/data/Output.txt");

    }

}
