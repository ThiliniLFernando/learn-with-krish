package memento;

import java.util.Date;

public class Editor implements Cloneable{
    private String title;
    private String paragraph;
    private int fontSize;
    private String fontColor;
    private Date lastEdited;

    public Editor() {
    }
    
    

    public Editor(String title,String paragraph,Date lastEdited) {
        this.title = title;
        this.paragraph = paragraph;
        this.fontSize = 12;
        this.fontColor = "black";
        this.lastEdited = lastEdited;
    }
    
    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the paragraph
     */
    public String getParagraph() {
        return paragraph;
    }

    /**
     * @param paragraph the paragraph to set
     */
    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    /**
     * @return the fontSize
     */
    public int getFontSize() {
        return fontSize;
    }

    /**
     * @param fontSize the fontSize to set
     */
    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * @return the fontColor
     */
    public String getFontColor() {
        return fontColor;
    }

    /**
     * @param fontColor the fontColor to set
     */
    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    /**
     * @return the lastEdited
     */
    public Date getLastEdited() {
        return lastEdited;
    }

    /**
     * @param lastEdited the lastEdited to set
     */
    public void setLastEdited(Date lastEdited) {
        this.lastEdited = lastEdited;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }

    @Override
    public String toString() {
        return "["
                + "title = "+title+", "
                + "paragraph="+paragraph+", "
                + "fontsize="+fontSize+","
                + "fontColor="+fontColor+", "
                + "lastEdited="+lastEdited+""
                + "]";
    }
    
    
    
}
