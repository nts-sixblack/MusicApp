package app.music.musicapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemDetail {
    private int itag;
    private String mimeType;
    private int width;
    private int height;
    private String contentLength;
    private String quality;
    private String qualityLabel;
    private String audioQuality;
    private String audioSampleRate;
    private String url;
    private String signatureCipher;
}
