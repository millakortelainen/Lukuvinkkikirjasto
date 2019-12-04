package domain;

import java.util.ArrayList;

public class Vink {

    private String headline;
    private String type;
    private ArrayList<String> tags;
    private String comment;
    private String link;
    private Integer databaseID;
    private Integer readingStatus;

    public Vink(String headline, String type, ArrayList<String> tags, String comment, String link) {
        this.headline = headline;
        this.type = type;
        this.tags = tags;
        this.comment = comment; 
        this.link = link;
        this.databaseID = -1;
        this.readingStatus = 1;
    }
    
    public Vink(String headline, String type, ArrayList<String> tags, String comment, String link, Integer readingStatus, Integer ID) {
        this.headline = headline;
        this.type = type;
        this.tags = tags;
        this.comment = comment;  
        this.link = link;
        this.readingStatus = readingStatus;
        this.databaseID = ID;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList getTags() {
        return tags;
    }

    public void setTags(ArrayList tags) {
        this.tags = tags;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getDatabaseID() {
        return databaseID;
    }

    public void setDatabaseID(Integer databaseID) {
        this.databaseID = databaseID;
    }
    
    public Integer getReadingStatus() {
        return readingStatus;
    }
    
    public void setReadingStatus(Integer readingStatus) {
        this.readingStatus = readingStatus;
    }
}