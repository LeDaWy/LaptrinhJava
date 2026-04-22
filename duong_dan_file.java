package duongdanfile;

public class duong_dan_file {
	 public static void main(String[] args) {
	        String path = "D:/music/bolero/longme.mp3";

	        // Lấy tên file (longme.mp3)
	        String fileName = path.substring(path.lastIndexOf("/") + 1);
	        System.out.println("Tên file: " + fileName);

	        // Lấy tên không có đuôi (longme)
	        String nameOnly = fileName.substring(0, fileName.lastIndexOf("."));
	        System.out.println("Tên không đuôi: " + nameOnly);
	    }
}
