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
public void insertWordUtil(TrieNode root,String word){
   
    // Base case
if(word.length() == 0) {
    root.isTerminal = true;
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

public boolean searchUtil(TrieNode root, String word){
    if(word.length()==0){
        return root.isTerminal;
    }
    int index=word.charAt(0)-'a';
    TrieNode child=root.children[index];
    if(child==null){
        return false;
    }
    else{
        searchUtil(child, word.substring(1));
    }
    //No meaning jus to void ErrorMessage
    return false;
}


// Search For the Word in the Dicstionary
public boolean search(String word){
    word=word.toLowerCase();   
    return searchUtil(root, word);
}

// Remove a word from dicstionary
public void remove (String word){

}

public count countWords(){
return 0;
}


public class TrieUse{
   public static void main(String[] args) {
    
   }
}