package day08;

public class Main {
    public static void main(String[] args) {
        String raw = "  Hoc Java moi ngay  ";
        String clean = raw.trim().replaceAll("\\s+", " ");
        System.out.println("Chuẩn hóa: " + clean);
        System.out.println("Số từ: " + clean.split(" ").length);
        System.out.println("Đảo ngược: " + new StringBuilder(clean).reverse());
    }
}
