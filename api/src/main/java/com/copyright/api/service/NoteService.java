package com.copyright.api.service;

import com.copyright.api.Note;
import java.util.List;

/**
 * Service for Notes.
 * <p/>
 * Date: 1/26/12
 *
 * @author Nikita Levyankov
 */
public interface NoteService {

    List<Note> getNotes();
}
