import java.util.Scanner;

class Album {
    private Song[] songs;
    private int songCount;
    private String publisherName;
    private String publicationDate;

    public Album(String publisherName, String publicationDate, int numSongs) {
        this.publisherName = publisherName;
        this.publicationDate = publicationDate;
        this.songs = new Song[numSongs]; 
        this.songCount = 0;
    }

    public void addSong(String singer, String genre, String recordingDate) {
        if (songCount < songs.length) {
            songs[songCount] = new Song(singer, genre, recordingDate);
            songCount++;
        } else {
            System.out.println("Cannot add more songs. Album is full.");
        }
    }

    public Song[] getSongs() {
        return songs;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    class Song {
        private String singer;
        private String genre;
        private String recordingDate;

        public Song(String singer, String genre, String recordingDate) {
            this.singer = singer;
            this.genre = genre;
            this.recordingDate = recordingDate;
        }

        public String getSinger() {
            return singer;
        }

        public String getGenre() {
            return genre;
        }

        public String getRecordingDate() {
            return recordingDate;
        }
    }
}

public class DemoAlbum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter album publisher name: ");
        String publisherName = scanner.nextLine();
        
        System.out.print("Enter album publication date: ");
        String publicationDate = scanner.nextLine();
        
        System.out.print("Enter number of songs: ");
        int numSongs = scanner.nextInt();
        scanner.nextLine(); 
        
        Album album = new Album(publisherName, publicationDate, numSongs);
        
        for (int i = 0; i < numSongs; i++) {
            System.out.println("Enter details for song " + (i + 1) + ":");
            System.out.print("Singer: ");
            String singer = scanner.nextLine();
            System.out.print("Genre: ");
            String genre = scanner.nextLine();
            System.out.print("Recording Date: ");
            String recordingDate = scanner.nextLine();
            
            album.addSong(singer, genre, recordingDate);
        }
        
        System.out.println("\nAlbum published by: " + album.getPublisherName());
        System.out.println("Publication Date: " + album.getPublicationDate());
        
        for (Album.Song song : album.getSongs()) {
            if (song != null) { 
                System.out.println("Song by " + song.getSinger() + " | Genre: " + song.getGenre() + " | Recorded on: " + song.getRecordingDate());
            }
        }
        
        scanner.close();
    }
}