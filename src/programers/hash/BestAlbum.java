package programers.hash;

import java.util.*;

public class BestAlbum {
    public static void main(String[] args) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        List<Integer> an = new ArrayList<>();
        class Song{
            Song(int id, int plays, String genre){
                this.id = id;
                this.plays = plays;
                this.genre = genre;
            }
            int id, plays;
            String genre;
        }

        List<Song> songs = new ArrayList<>();
        Map<String, Integer> genreTotal = new HashMap<>();

        String[] genres = new String[]{"classic", "pop", "pop", "pop", "pop"};
        int[] plays = new int[]{500, 600, 150, 800, 2500};

        for(int i = 0 ; i< genres.length ; i++){
            songs .add(new Song(i, plays[i], genres[i]));

            if(genreTotal.containsKey(genres[i])){
                genreTotal.put(genres[i],  genreTotal.get(genres[i])+plays[i]);
            }else{
                genreTotal.put(genres[i], plays[i]);
            }
        }

        songs.sort(new Comparator<Song>() {
            @Override
            public int compare(Song o1, Song o2) {
                int i = o1.genre.compareTo(o2.genre);
                if(i < 0)
                    return -1;
                else if(i ==0)
                    return o2.plays - o1.plays;
                else
                    return 1;

            }
        });

        List<String> keySetList = new ArrayList<>(genreTotal.keySet());
        Collections.sort(keySetList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return genreTotal.get(o2) - genreTotal.get(o1);
            }
        });

        int index = 0;
        for(String g: keySetList){
            int count = 0;

            for(Song s : songs){
                if(s.genre.equals(g) && count < 2 ){
                    System.out.println(s.id);
                    list.add(s.id);
                    count++;
                }
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        System.out.println("");
    }



}

//토탈 순 정렬 해쉬맵

//장르 {
//  토탈
//플레이수 정렬 해쉬맵
//  해쉬맵 이름: 플레이수
// }
