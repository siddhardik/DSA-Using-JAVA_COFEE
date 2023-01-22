// create a TrieNode Class
class TrieNode{
   char data;
   boolean isTerminal;   // By default boolean is false
   // isTerminal to check whether word is ended here or not
   TrieNode children[];

   // Constructor

   TrieNode(char data){
    this.data=data;
    this.isTerminal=false;
    this.children=new TrieNode[26];   // Total 26 Letters Exist

   }

}

class Trie{
private TrieNode root;

// Constructor
Trie (){
    root=new TrieNode('\0');
}

// Add Word To the Dicstionary
private void insertWordUtil(TrieNode root,String word){
   
    // Base case
if(word.length() == 0) {
    root.isTerminal = true;
    System.out.println("Inserted Successfully " + root.isTerminal);
    return;
    }

    int childIndex = word.charAt(0) - 'a';
    TrieNode child = root.children[childIndex];
    if(child == null){
        child = new TrieNode(word.charAt(0));
        root.children[childIndex] = child;
    }
    // Recursive call
    insertWordUtil(child, word.substring(1));
    

}
public void insertWord(String word) {
    word=word.toLowerCase();
    insertWordUtil(root, word);
    }

private boolean searchUtil(TrieNode root, String word){
    if(word.length()==0){
        System.out.println("Search " + root.isTerminal);
        return root.isTerminal;
    }
    int index=word.charAt(0)-'a';
    TrieNode child=root.children[index];
    if(child==null){
        return false;
    }
    else{
        return searchUtil(child, word.substring(1));
    }
}


// Search For the Word in the Dicstionary
public boolean search(String word){
    word=word.toLowerCase();   
    return searchUtil(root, word);
}
 private void removeWord(TrieNode root, String word) {
    // Base case
    if(word.length() == 0) {
    root.isTerminal = false;
    System.out.println("Remove Word Successfully");
    return;
    }
    // Small calculation
    TrieNode child;
    int index = word.charAt(0) - 'a';
    if(root.children[index] != null) {
    child = root.children[index];
    }
    else {
    // Word not found
    return;
    
    }
    removeWord(child, word.substring(1));
   
    // Removing child Node if it is useless
    if(child.isTerminal == false) {
    for(int i = 0; i < 26; i++) {
    if(child.children[i] != null) {
    return;
    }
    }
    // delete child
    root.children[index] = null;
    }
    }
    

// Remove a word from dicstionary
public void remove (String word){
    word=word.toLowerCase();
    removeWord(root, word);
}

public int countWords(){
return 0;
}
}


public class TrieUse{
   public static void main(String[] args) {
    Trie dis=new Trie();
    dis.insertWord("good");
    System.out.println(dis.search("good"));
    dis.insertWord("goodbye");
    dis.remove("good");
    System.out.println(dis.search("good"));
   }
}