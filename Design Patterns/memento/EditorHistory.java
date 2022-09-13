package memento;

import java.util.Stack;

/**
 *
 * Care Taker
 */
public class EditorHistory {
    Stack<Document.DocumentMemento> history = new Stack<>();
    
    public void save(Document document) throws CloneNotSupportedException {
        history.push(document.save());
    }
    
    public void undo(Document document) throws CloneNotSupportedException {
        if(!history.isEmpty()){
           document.undo(history.pop());
        }else{
            System.out.println("Cannot Undo");
        }
    }
    
}
