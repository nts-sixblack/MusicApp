package app.music.musicapp.response;

import app.music.musicapp.model.Fields;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecordResponse {
    private String id;
    private Date createdTime;
    private FieldResponse fields;
}
