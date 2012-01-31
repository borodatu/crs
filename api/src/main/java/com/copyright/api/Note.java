package com.copyright.api;

/**
 * Represents Note item
 * <p/>
 * Date: 1/26/12
 *
 * @author Nikita Levyankov
 */
public interface Note {

    Integer getId();

    void setId(Integer id);

    String getName();

    void setName(String name);

    String getComment();

    void setComment(String comment);

}
