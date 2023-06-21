package Entity;

import java.util.Scanner;

public class Posts implements inputInfo {
    private int AUTO_ID = 100;
    private int idPost;
    private String namePost;
    private double price;

    public Posts(){
        this.AUTO_ID = idPost;
        AUTO_ID++;
    }

    public int getAUTO_ID() {
        return AUTO_ID;
    }

    public void setAUTO_ID(int AUTO_ID) {
        this.AUTO_ID = AUTO_ID;
    }

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public String getNamePost() {
        return namePost;
    }

    public void setNamePost(String namePost) {
        this.namePost = namePost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Posts{" +
                "AUTO_ID=" + AUTO_ID +
                ", idPost=" + idPost +
                ", namePost='" + namePost + '\'' +
                ", price=" + price +
                '}';
    }
    @Override
    public void inputInfo(){
        System.out.println("Nhập tên bài viết");
        this.setNamePost(new Scanner(System.in).nextLine());
        System.out.println("Nhập đơn giá");
        this.setPrice(new Scanner(System.in).nextDouble());
    }
}
