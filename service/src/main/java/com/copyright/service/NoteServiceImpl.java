package com.copyright.service;

import com.copyright.api.Note;
import com.copyright.api.service.NoteService;
import com.copyright.domain.NoteImpl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Notes service.
 * <p/>
 * Date: 1/26/12
 *
 * @author Nikita Levyankov
 */
@Component
public class NoteServiceImpl implements NoteService {

    private static final int NOTES_COUNT = 10;

    public List<Note> getNotes() {
        List<Note> result = new ArrayList<Note>();
        for (int i = 1; i <= NOTES_COUNT; i++) {
            Note note = new NoteImpl();
            note.setId(i);
            note.setName("Note " + note.getId());
            note.setComment("Test Comment for NOTE: " + note.getId());
            result.add(note);
        }
        return result;
    }
}
