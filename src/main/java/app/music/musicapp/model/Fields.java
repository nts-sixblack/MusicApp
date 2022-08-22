package app.music.musicapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fields {
    private String luot_nghe;
    private String luot_thich;
    private String thoi_gian;
    private String Music_Url;
    private String Image_Url;
    private String Music_Size;
    private String Composed;
}
