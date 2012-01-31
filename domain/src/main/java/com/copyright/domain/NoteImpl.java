package com.copyright.domain;

import com.copyright.api.Note;

/**
 * Note domain implementation
 * <p/>
 * Date: 1/26/12
 *
 * @author Nikita Levyankov
 */
public class NoteImpl implements Note {

    private Integer id;
    private String comment;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
