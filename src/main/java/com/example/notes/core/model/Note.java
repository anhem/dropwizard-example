package com.example.notes.core.model;

import com.example.notes.api.NoteJson;
import org.bson.types.ObjectId;

import java.util.Date;

public class Note {

    private ObjectId _id;
    private Date created;
    private String subject;
    private String message;

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static Note create(NoteJson noteJson) {
        Note note = new Note();
        note.created = noteJson.getCreated();
        note.subject = noteJson.getSubject();
        note.message = noteJson.getMessage();
        return note;
    }
}
