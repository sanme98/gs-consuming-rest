package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
    @JsonProperty("_id")
    private String _id;
    @JsonProperty("content")
    private String content;
    @JsonProperty("author")
    private String author;
    @JsonProperty("authorSlug")
    private String authorSlug;
    @JsonProperty("length")
    private int length;
    @JsonProperty("tags")
    private String[] tags;

    public Quote() {
    }

    public String get_Id() {
        return _id;
    }

    public void set_Id(String _id) {
        this._id = _id;
    }

    public String get_Content() {
        return content;
    }

    public void set_Content(String content) {
        this.content = content;
    }

    public String get_Author() {
        return author;
    }

    public void set_Author(String author) {
        this.author = author;
    }

    public String get_AuthorSlug() {
        return authorSlug;
    }

    public void set_AuthorSlug(String authorSlug) {
        this.authorSlug = authorSlug;
    }

    public int get_Length() {
        return length;
    }

    public void set_Length(int length) {
        this.length = length;
    }

    public String[] get_Tags() {
        return tags;
    }

    public void set_Tags(String[] tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "@Value {" +
            "_id=" + _id +
            ", content=" + content +
            ", author=" + author +
            ", authorSlug=" + authorSlug +
            ", length=" + length +
            ", tags=" + tagsToString() + '\'' +
            "}";
    }

    private String tagsToString() {
        StringBuilder sb = new StringBuilder();
        for (String string : tags) {
            sb.append(string + ", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
