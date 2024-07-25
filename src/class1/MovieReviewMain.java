package class1;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview ironMan = new MovieReview();

        ironMan.title = "아이언맨3";
        ironMan.review = "희대의 명작이라고 생각함, 남자의 심금을 울린달까?";

        System.out.println("영화제목 : " + ironMan.title + " 리뷰 : " + ironMan.review);

        MovieReview[] movieReviews = {ironMan};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화제목 : " + movieReview.title + " 리뷰 : " + movieReview.review);
        }
    }
}
