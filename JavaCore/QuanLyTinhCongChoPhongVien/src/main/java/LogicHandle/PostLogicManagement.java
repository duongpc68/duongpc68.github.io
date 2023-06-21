package LogicHandle;

import Entity.Posts;

import java.util.Scanner;

public class PostLogicManagement {
    private  Posts[] posts = new Posts[1000];
  void inputNewPosts() {
        System.out.println("Bạn muốn thêm mới bao nhiêu kiểu bài viết");
        int postNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < postNumber; i++) {
            System.out.println("Nhập thông tin cho kiểu bài viết thứ" + (i + 1));
            Posts posts1 = new Posts();
            posts1.inputInfo();
            savePost(posts1);
        }
    }
    void showPosts() {
        for (int i = 0; i < posts.length; i++) {
            if (posts[i] != null) {
                System.out.println(posts[i]);
            }
        }

    }
  void savePost(Posts posts1) {
        for (int j = 0; j < posts.length; j++) {
            if (posts[j] == null) {
                posts[j] = posts1;
                break;
            }
        }
    }
    public  boolean postIsNotEmpty(){
        for (int i = 0; i < posts.length; i++){
            if (posts[i] != null){
                return true;
            }
        }
        return false;
    }

}
