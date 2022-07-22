public class MediaPlayerAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipo) {
        if (tipo != TipoMedia.MP3) {
            this.advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia, String nomeArquivo) {
        if (tipoMedia.equals(TipoMedia.MP4)) {
            this.advancedMediaPlayer.reproduzirMp4(nomeArquivo);
        } else if (tipoMedia.equals(TipoMedia.VLC)) {
            this.advancedMediaPlayer.reproduzirVlc(nomeArquivo);
        }
    }

    public AdvancedMediaPlayer getAdvancedMediaPlayer() {
        return advancedMediaPlayer;
    }

    public void setAdvancedMediaPlayer(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }
}
