package app.music.musicapp.service;

import app.music.musicapp.model.Fields;
import org.springframework.stereotype.Service;

@Service
public class FieldService {

    public Fields findField(String id) {
        Fields fields = new Fields();
        return fields;
    }
}
