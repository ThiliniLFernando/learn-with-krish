package memento;

public class Document {

    private Editor editor = new Editor();

    public Editor getEditor() throws CloneNotSupportedException {
        return (Editor) editor.clone();
    }
    
    public void saveEditor(Editor e){
        editor = e;
    }

    static class DocumentMemento {
        private Editor editor ;

        public DocumentMemento(Editor editor) {
            this.editor = editor;
        }

        public Editor getEditor() {
            return editor;
        }
    }

    @Override
    public String toString() {
        return this.editor.toString();
    }
    
    public DocumentMemento save() throws CloneNotSupportedException {
        return new DocumentMemento(getEditor());
    }
    
    public void undo(DocumentMemento dm) throws CloneNotSupportedException {
        editor = dm.getEditor();
    }

}
