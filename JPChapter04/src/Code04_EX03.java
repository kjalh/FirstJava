
public class Code04_EX03 {
	static class Song{
		String title, artist, country;
		int year;
		
		public Song(int year, String country, String artist, String title) {
			this.year = year;
			this.country = country;
			this.artist = artist;
			this.title = title;
		}
		
		public void show() {
			System.out.print(year + "년 " + country + "국적의 " + artist + "가 부른 " + title );
		}
		
	}
	
	public static void main(String[] args) {
		Song s = new Song(1978, "스웨덴", "ABBA", "Danceing Queen");
		s.show();
	}

}
