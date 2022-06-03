public class Main {
    public static void main(String[] args) {

        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
        post.name = "Иван";
        post.passport = "1234 № 12345678";
        post.patronymic = "Иваныч";
        post.phone = "8 (800)-555-35-35";
        post.surname = "Приходько";
        post.subscription = true;

    }
}
