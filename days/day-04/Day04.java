
public class Day04 {
    public static void main(String[] args) {
        int score = 82;
        String rank;
        if (score >= 90) rank = "Xuất sắc";
        else if (score >= 75) rank = "Khá";
        else if (score >= 50) rank = "Trung bình";
        else rank = "Cần cố gắng";
        System.out.println("Xếp loại: " + rank);
    }
}
