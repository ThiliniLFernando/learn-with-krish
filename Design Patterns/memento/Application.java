package memento;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Editor e1 = new Editor("Memento Design Pattern", "about the memento", new Date());
        
        Editor e2 = new Editor("Memento Design Pattern", "about the memento", new Date());
        e2.setFontColor("Blue");
        e2.setFontSize(16);
        
        Editor e3 = new Editor("Memento Pattern", "Memento design pattern has three pillers which are originator,care taker and memento", new Date());
        e3.setFontColor("Gray");
        e2.setFontSize(10);
        
        try {
            EditorHistory eh = new EditorHistory();
            
            Document document = new Document();
            document.saveEditor(e1);
            eh.save(document);
            System.out.println(document.toString());
            
            document.saveEditor(e2);
            eh.save(document);
            System.out.println(document.toString());
            
            document.saveEditor(e3);
            System.out.println(document.toString());
            
            eh.undo(document);
            System.out.println(document.toString());
            
            Editor e4 = new Editor("Design Pattern", "about the designpatterns", new Date());
            document.saveEditor(e4);
            System.out.println(document.toString());
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
