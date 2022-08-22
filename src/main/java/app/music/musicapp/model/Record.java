package app.music.musicapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Record {
    private String id;
    private Date createdTime;
    private Fields fields;
}
